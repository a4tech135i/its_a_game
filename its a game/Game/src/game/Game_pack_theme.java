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

    String thems;
    Question questionsBy100;
    Question questionsBy200;
    Question questionsBy300;
    Question questionsBy400;
    Question questionsBy500;

    public Game_pack_theme(String thems) {
        this.thems = thems;
    }

    public void getStateByTheme(Pack pack) {
        questionsBy100 = pack.getQuestionByThemeAndValue(thems, 100);
        questionsBy200 = pack.getQuestionByThemeAndValue(thems, 200);
        questionsBy300 = pack.getQuestionByThemeAndValue(thems, 300);
        questionsBy400 = pack.getQuestionByThemeAndValue(thems, 400);
        questionsBy500 = pack.getQuestionByThemeAndValue(thems, 500);
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
