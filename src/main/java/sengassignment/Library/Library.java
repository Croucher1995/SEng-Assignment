package sengassignment.Library;
import java.util.ArrayList;

public class Library {
    ArrayList <User> users = new ArrayList<>();
    
    public Library(){
        
    }
    
    public void addUser(User u){
        users.add(u);
    }
    
    public void removeUser(User u){
        users.remove(u);
    }
    
    public void loanBookTo(Book b, User u){
        if(u.loanCounter_check()){ //check if user has exceeded 3 books
            if(b.isBorrowed()){ //check if book is already on loan
                if (){
                    System.out.println("Book already on loan.");
               } 
                else
                    System.out.println("Exceeded 4 weeks");
            }
            else{
                b.borrowed();
                b.loanInfo(u);
                u.loanCounter_inc();
                System.out.println("Successful");
            }       
        }
        
        else
            System.out.println("User has exceeded maximum number of books.");
    }
    
    public void returnBook(Book b){
        b.returned();
        User u = b.getLoanInfo();
        u.loanCounter_dec();
    }  
}
