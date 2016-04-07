package sengassignment.Library;
import java.util.ArrayList;

public class Library {
    ArrayList <User> users = new ArrayList<>();
    private boolean checkLoan;
    private boolean checkReturn;
    
    
    public Library(){
        checkLoan = false;
    }
    
    public void addUser(User u){
        users.add(u);
    }
    
    public void removeUser(User u){
        users.remove(u);
    }
    
    public int numberofUsers(){
    	return users.size();
    }
    
    public void loanBookTo(Book b, User u){
        if(u.loanCounter_check()){ //check if user has exceeded 3 books
            if(b.isBorrowed()){ //check if book is already on loan
                if (b.exceeds4Weeks()){// to check if it is overdue
                    System.out.println("Book already on loan.");
                    setCheckLoan(false);
               } 
        
                else{
                    System.out.println("Exceeded 4 weeks");
                    setCheckLoan(false);
                }
            }
            else{
                b.borrowed();
                b.loanInfo(u);
                u.loanCounter_inc();
                System.out.println("Successful");
                setCheckLoan(true);
            }       
        }
        else{
           System.out.println("User has exceeded maximum number of books.");
           setCheckLoan(false);
        }
    }
    
    public void returnBook(Book b){
        b.returned();
        User u = b.getLoanInfo();
        u.loanCounter_dec();
    }  
    
    public void setCheckLoan(boolean c){
        this.checkLoan = c;
    }
    
    public boolean getCheck(){
        return this.checkLoan;
    }
}
