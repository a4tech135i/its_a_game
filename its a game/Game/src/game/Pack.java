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
public class Pack implements Serializable{
    private String Name;
    private ArrayList<Question> Questions;
    
    //Конструктор

    public Pack(String Name, ArrayList<Question> Questions) {
        this.Name = Name;
        this.Questions = Questions;
    }

    
    //Конструктор для побудови теста на основі існуючого
    public Pack(int n, Pack test)
    {
        Name=test.getName();
        Questions = new ArrayList<>();
        
        ArrayList<Question> tmp=test.getQuestions();
        ArrayList<Integer> usedIndex=new ArrayList<>();
        
        for(int i=0;i<n;i++)
        {
            Random randob = new Random();
            int index=randob.nextInt(tmp.size());
            while(usedIndex.contains(index)) index=randob.nextInt(tmp.size());
            usedIndex.add(index);
            Questions.add(tmp.get(index));
        }
    }
    
    public ArrayList<Question> getQuestions(){return Questions;}
    public String getName(){return Name;}
    
}
