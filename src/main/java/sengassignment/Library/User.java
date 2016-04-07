/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sengassignment.Library;

//import java.util.UUID;

/**
 *
 * @author Caroline
 */
public class User {
    private String name;
    private String surname;
    private String town;
    private String email_address;
    private int count;
    private static int countID;


//to initialise
    public User(){
        name = "ANDRE";
        surname = "CROUCH";
        town = "RABAT";
        email_address = "acrouch@gmail.com";
        count =0;
        countID =0;
    }

    public User(String name, String surname, String town, String email_address){
        this.name = name;
        this.surname = surname;
        this.town = town;
        this.email_address = email_address;
        //this.ID = UUID.randomUUID();
        countID = countID +1;
    }

    public boolean loanCounter_check()
    {
        return count <= 3; 
    }
    
    public void loanCounter_inc()
    {
        count ++;
        
    }
    
    public void loanCounter_dec()
    {
        count --;   
    }

    public int getUserID(){
        return User.countID;
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
