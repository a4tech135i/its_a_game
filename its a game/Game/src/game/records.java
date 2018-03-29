/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

/**
 *
 * @author user
 */
public class records {
    private int id;
    private String login;
    private String pack;
    private String bals;
    
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
    
    public String getPack(){
        return pack;
    }
    
    public void setpack(String p){
        pack = p;
    }

    public String getbals(){
        return bals;
    }
    
    public void setbals(String newName){
        bals = newName;
    }
}
