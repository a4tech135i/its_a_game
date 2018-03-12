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
    private ArrayList<Question> Questions;

    public Pack(String Name, ArrayList<Question> Questions) {
        this.Name = Name;
        this.Questions = Questions;
    }

    public Question getQuestionByThemeAndValue(String theme, int value) {
        Questions = new ArrayList<>();

        ArrayList<Question> tmp = getQuestionByValue(getQuestionByTheme(theme), value);
        Random randob = new Random();
        return tmp.get(randob.nextInt(tmp.size()));
    }

    public ArrayList<Question> getQuestionByTheme(String theme) {
        Questions = new ArrayList<>();

        ArrayList<Question> tmp = new ArrayList<Question>();

        for (int i = 0; i < Questions.size(); i++) {
            if (Questions.get(i).getTheme() == theme) {
                tmp.add(Questions.get(i));
            }
        }
        return tmp;
    }

    public ArrayList<Question> getQuestionByValue(ArrayList<Question> q, int val) {
        Questions = new ArrayList<>();

        ArrayList<Question> tmp = new ArrayList<Question>();

        for (int i = 0; i < q.size(); i++) {
            if (q.get(i).getValue()== val) {
                tmp.add(q.get(i));
            }
        }
        return tmp;
    }

    public ArrayList<String> getTheme() {
        
        ArrayList<String> tmp = new ArrayList<String>();

        for (int i = 0; i < Questions.size(); i++) {
            if(!tmp.contains(Questions.get(i).getTheme())) tmp.add(Questions.get(i).getTheme());
        }
        return tmp;
    }
    
    public Pack(int n, Pack test) {
        Name = test.getName();
        Questions = new ArrayList<>();

        ArrayList<Question> tmp = test.getQuestions();
        ArrayList<Integer> usedIndex = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            Random randob = new Random();
            int index = randob.nextInt(tmp.size());
            while (usedIndex.contains(index)) {
                index = randob.nextInt(tmp.size());
            }
            usedIndex.add(index);
            Questions.add(tmp.get(index));
        }
    }

    public ArrayList<Question> getQuestions() {
        return Questions;
    }

    public String getName() {
        return Name;
    }

}
