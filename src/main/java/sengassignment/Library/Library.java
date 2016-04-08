package sengassignment.Library;
import java.util.ArrayList;
import java.util.Date;

public class Library {
    ArrayList <User> users = new ArrayList<>();
    private boolean checkLoan;
    private boolean checkReturn;
    
    
    public Library(){
        checkLoan = false;
        checkReturn = false;
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
                if (b.exceeds4Weeks(System.currentTimeMillis())){// to check if it is overdue
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
        
        /*
	if(u.loanCounter_check()){ //check if user has exceeded 3 books
            if(!b.isBorrowed()){ //check if book is already on loan
                if (!b.exceeds4Weeks(System.currentTimeMillis())){// to check if it is overdue
                    Date d = new Date();
                    b.borrowed();//set borrowed to true
                    b.loanInfo(u);//save user info to the book being borrowed
                    b.setLoanDate(d);//set the date of the loan
                    u.loanCounter_inc();//increment the number of books the user has
                    setCheckLoan(true); 
                    System.out.println("Successful");
                } 
                else{
                    System.out.println("Exceeded 4 weeks");
                    setCheckLoan(false); 
                }
            }
            else{
                System.out.println("Book already on loan.");
                setCheckLoan(false);
            }       
        }
        else{
           System.out.println("User has exceeded maximum number of books.");
           setCheckLoan(false);
        }*/
    }
    
    public void returnBook(Book b){
        b.returned();
        User u = b.getLoanInfo();
        u.loanCounter_dec();
        setCheckReturn(true);
    }  
    
    public void setCheckLoan(boolean c){
        this.checkLoan = c;
    }
    
    public boolean getCheckLoan(){
        return this.checkLoan;
    }
   
    public boolean getCheckReturn(){
        return this.checkReturn;
    }
    
    public void setCheckReturn(boolean c){
        this.checkReturn = c;
    }
    
    
    
    
}
