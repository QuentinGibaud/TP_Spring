/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.centrale.prweb.items;

/**
 *
 * @author Quentin GIBAUD
 */
public class User {
    private String login;
    private String password;
    
    public User(){
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getPassw(){
        return password;
    }
    
    public void setPassw(String passw){
        this.password=passw;
    }
}
