package sengassignment.Library;

public class User implements Observer{
    private String name;
    private String surname;
    private String town;
    private String email_address;
    private int count;
    private int countID;

    private Observable observable = null;
    Library l = new Library();
    
    public User(Observable observable){
        this.observable = observable;
    }
    
    public void update(int i){
        System.out.println(this.getUserName() + ", your position in the queue is " + i);
    }
    
    //to initialise
    public User(){
        name = "";
        surname = "";
        town = "";
        email_address = "";
        count =0;
        countID =0;
    }

    public User(String name, String surname, String town, String email_address){
        this.name = name;
        this.surname = surname;
        this.town = town;
        this.email_address = email_address;
        countID =countID +1;
    }

    public boolean loanCounter_check()
    {
        return count <= 2; 
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
        return countID;
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
