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
public class user1 {
    private int id;
    private String login;
    private String pass;
    private String name_sur;
    
    public int getId(){
        return id;
    }

    public void setId(int i){
        id = i;
    }
    
    public String getLogin(){
        return login;
    }

    public void setLogin(String l){
        login = l;
    }
    
    public String getPass(){
        return pass;
    }
    
    public void setPass(String p){
        pass = p;
    }

    public String getName_sur(){
        return name_sur;
    }
    
    public void setName(String newName){
        name_sur = newName;
    }
}
