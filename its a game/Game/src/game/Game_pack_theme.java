/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.ArrayList;

/**
 *
 * @author kuchm
 */
public class Game_pack_theme {

    String error="";
    String them;
    Pack pack;
    Question questionsBy100;
    Question questionsBy200;
    Question questionsBy300;
    Question questionsBy400;
    Question questionsBy500;

    public Game_pack_theme(String them, Pack pack) {
        this.them = them;
        this.pack=pack;
    }

    public void getStateByTheme() {
        questionsBy100 = pack.getQuestionByThemeAndValue(them, 100);
        questionsBy200 = pack.getQuestionByThemeAndValue(them, 200);
        questionsBy300 = pack.getQuestionByThemeAndValue(them, 300);
        questionsBy400 = pack.getQuestionByThemeAndValue(them, 400);
        questionsBy500 = pack.getQuestionByThemeAndValue(them, 500);
    }

    public String getError()
    {
        if(questionsBy100==null) error+="По темі " + them + " немає питання за 100 балів\n";
        if(questionsBy200==null) error+="По темі " + them + " немає питання за 200 балів\n";
        if(questionsBy300==null) error+="По темі " + them + " немає питання за 300 балів\n";
        if(questionsBy400==null) error+="По темі " + them + " немає питання за 400 балів\n";
        if(questionsBy500==null) error+="По темі " + them + " немає питання за 500 балів\n";
        return error;
    }

    public Question getQuestionsBy100() {
        return questionsBy100;
    }

    public Question getQuestionsBy200() {
        return questionsBy200;
    }

    public Question getQuestionsBy300() {
        return questionsBy300;
    }

    public Question getQuestionsBy400() {
        return questionsBy400;
    }

    public Question getQuestionsBy500() {
        return questionsBy500;
    }

}
