/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sengassignment.Library;

import java.io.*;
import java.util.UUID;

/**
 *
 * @author Caroline
 */
public class User {
    private String name;
    private String surname;
    private String town;
    private String email_address;
    private UUID ID;
    private int count;


//to initialise
    public User(){
        name = "ANDRE";
        surname = "CROUCH";
        town = "RABAT";
        email_address = "acrouch@gmail.com";
        count =0;
    }

    public User(String name, String surname, String town, String email_address){
        this.name = name;
        this.surname = surname;
        this.town = town;
        this.email_address = email_address;
        this.ID = UUID.randomUUID();
    }

    public boolean loanCounter_check()
    {
        if (count > 3) return false;
        else return true;
        
        
    }
    
    public boolean loanCounter_inc()
    {
        count ++;
        
    }
    
    public boolean loanCounter_dec()
    {
        count --:
        
    }

    public UUID getUserID(){
        return this.ID;
    }

    public String getUserName(){
        return this.name;
    }

    public String getUserSurname(){
        return this.surname;
    }

    public String getUserTown(){
        return this.town;
    }

    public String getUserEmail(){
        return this.email_address;
    }
}
