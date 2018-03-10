/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Image;
import java.io.Serializable;

/**
 *
 * @author admin
 */
public class Question implements Serializable {

    private String text, theme, answer;
    private int value;

    public Question(String text, String theme, String answer, int value) {
        this.text = text;
        this.theme = theme;
        this.answer = answer;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getAnswer() {
        return answer;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public String getTheme() {
        return theme;
    }
}
