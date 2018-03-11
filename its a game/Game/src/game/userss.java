/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author Andriy
 */
public class userss {
    private String login;
    private String name_sur;
    private int bals;
    private int nomer;
    
    public String getLogin(){
        return login;
    }

    public void setLogin(String l){
        login = l;
    }
    
    public int getBals(){
        return bals;
    }

    public void setBals(int i){
        bals = i;
    }
    
    public int getNomer(){
        return nomer;
    }

    public void setNomer(int i){
        nomer = i;
    }
    
    public String getName_sur(){
        return name_sur;
    }
    
    public void setName(String newName){
        name_sur = newName;
    }
}
