/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author admin
 */
public class Pack implements Serializable {

    private String Name;
    private ArrayList<Question> questions;

    public Pack(String Name, ArrayList<Question> Questions) {
        this.Name = Name;
        this.questions = Questions;
    }

    public Question getQuestionByThemeAndValue(String theme, int value) {
        ArrayList<Question> tmp = getQuestionByValue(theme, value);
        Random randob = new Random();

        if (tmp.size() == 0) {
            return null;
        }
        return tmp.get(randob.nextInt(tmp.size()));
    }

    public ArrayList<Question> getQuestionByValue(String theme, int val) {
        ArrayList<Question> tmp = new ArrayList<Question>();

        for (int i = 0; i < questions.size(); i++) {
            if ((questions.get(i).getValue() == val) && (theme.equals(questions.get(i).getTheme()))) {
                tmp.add(questions.get(i));
            }
        }

        return tmp;
    }

    public ArrayList<Question> getQuestionByTheme(String theme) {
        ArrayList<Question> tmp = new ArrayList<Question>();

        for (int i = 0; i < questions.size(); i++) {
            if (theme.equals(questions.get(i).getTheme())) {
                tmp.add(questions.get(i));
            }
        }
        return tmp;
    }

    public void testValue() {
        for (int i = 0; i < questions.size(); i++) {
            System.out.println(questions.get(i).getValue());
        }
    }

    public ArrayList<String> getTheme() {

        ArrayList<String> tmp = new ArrayList<String>();

        for (int i = 0; i < questions.size(); i++) {
            if (!tmp.contains(questions.get(i).getTheme())) {
                tmp.add(questions.get(i).getTheme());
            }
        }
        return tmp;
    }

    public Pack(int n, Pack pack) {
        Name = pack.getName();
        questions = new ArrayList<>();

        ArrayList<Question> tmp = pack.getQuestions();
        ArrayList<Integer> usedIndex = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Random randob = new Random();
            int index = randob.nextInt(tmp.size());
            while (usedIndex.contains(index)) {
                index = randob.nextInt(tmp.size());
            }
            usedIndex.add(index);
            questions.add(tmp.get(index));
        }
    }

    public void checkPackValueByTheme() {

    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public String getName() {
        return Name;
    }

}
