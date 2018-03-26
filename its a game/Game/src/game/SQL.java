/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.Serializable;

/**
 *
 * @author Andriy
 */
public class SQL implements Serializable{
    private String url;
    private String user;
    private String password;
    
    public SQL(String u,String uu,String pass)
    {
        url = u;
        user = uu;
        password = pass;
    }
    
    public String getUrl()
    {
        return url;
    }
    
    public String getUser()
    {
        return user;
    }
    
    public String getPassword()
    {
        return password;
    }
}
