package sengassignment.Library;
import java.util.ArrayList;
import java.util.Date;

public class Library {
    ArrayList <User> users = new ArrayList<User>();
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
	if(u.loanCounter_check()){                                          //check if user has exceeded 3 books
            if(!b.isBorrowed()){                                            //check if book is already on loan
                if (!b.exceedsANumberOfWeeks(System.currentTimeMillis(),4)){//check if a book is overdue
                    Date d = new Date();
                    b.borrowed();       //set borrowed to true
                    b.setLoanDate(d);   //set the date of the loan

                    b.setloanInfo(u);   //save user info to the book being borrowed
                    u.loanCounter_inc();//increment the number of books the user has
                    
                    setCheckLoan(true); 
                    System.out.println("Loan of " + b.getBookTitle() + " to " + u.getUserName() + " was successful\n");
                } 
                else{
                    System.out.println(u.getUserName() + " has one or more overdue books");
                    setCheckLoan(false); 
                }
            }
            else{
                System.out.println("\n" + b.getBookTitle() + " is already on loan.");
                b.attach(u);
                b.notifyObserver(u);
                setCheckLoan(false);
            }  
            
        }
        else{
           System.out.println(u.getUserName() + " has exceeded maximum number of books.");
           setCheckLoan(false);
        }
    }
    
    public void returnBook(Book b){
        Date d = new Date();

        b.returned();
        b.setLoanDate(d);
        
        User u = b.getLoanInfo();
        u.loanCounter_dec();
        
        setCheckReturn(true);
        System.out.println("\nReturn of " + b.getBookTitle() + " from " + u.getUserName() + " was sucessful.");
        
        if(b.numberOfObservers()!=0){
            User uNext = (User) b.getNextObserver();
            loanBookTo(b, uNext);
            b.detach(uNext);
            b.notifyAllObservers();
        }
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
