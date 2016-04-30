package sengassignment.Library;
import java.util.ArrayList;
import java.util.Date;
import static sengassignment.Library.Genre.*;

public class Book implements Observable{
    
    private String title;
    private String author; 
    private Genre genre;
    private int year;
    private int edition;  
    private int count;
    private Date date;
    
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private boolean onLoan;
    
    User u = new User();
   
    final long msInAWeek = 604800000;
    
    //to initialise 
    public Book(){
        title = "";
        author = ""; 
        genre = Default;
        year = 0;
        edition = 0;
        count =0;
        onLoan = false;
    }
    
    //to create a new book in the library
    public Book(String title, String author, Genre genre, int year, int edition){
        Date d = new Date();
        setBookGenre(genre);
        
        this.title = title;
        this.author = author;
        this.genre = getBookGenre();
        this.edition = edition;
        this.year = year;
        count++;
        date = d;

    }
    
    //when a book is being loaned
    public void setloanInfo(User u){
        this.u = u;
    }
    
    public User getLoanInfo(){
        return u;
    }
       
    public int getBookID(){
        return this.count;
    }
    
    public String getBookTitle(){
        return this.title;
    }
     
    public String getBookAuthor(){
        return this.author;
    }
    
    
    public void setBookGenre(Genre genre){
        switch (genre) {
            case Fiction:
                this.genre = Fiction;
                break;
                    
            case ScienceFiction:
                this.genre = ScienceFiction;
                break;
			
            case Fantasy:
                this.genre = Fantasy;
                break;
            
            case Action:
                this.genre = Action;
                break;

            case Romance:
                this.genre = Romance;
                break;				
            
            default:
                this.genre = Default;
                break;
        }
    }
    public Genre getBookGenre(){
        return genre;
    }
      
    public int getBookYear(){
        return this.year;
    }

    public int getBookEdition(){
        return this.edition;
    }
    
    public void borrowed(){
       onLoan = true;
    }
    
    public void returned(){
        onLoan = false;
    }
   
    public void setOnLoan(boolean onLoan){
        this.onLoan = onLoan;
        notifyAllObservers();
    }
    
    public boolean isBorrowed(){
        return onLoan;
    }
    
    public void setLoanDate(Date d){     
        this.date = d;
    }
    
    public Date getLoanDate(){
        return this.date;
    }
    
    public boolean exceedsANumberOfWeeks(long today, int noOfWeeks ){ 
    	long limit = noOfWeeks*msInAWeek;
    	long whenBorrowed = getLoanDate().getTime();
        return (today - limit) > whenBorrowed; 

    }
    
    public void attach(Observer observer){
        observers.add(observer);
    }
    
    public void detach(Observer observer){
        observers.remove(observer);
    }
    
    public void notifyAllObservers(){
        for(Observer observer:observers){
            observer.update(observers.indexOf(observer));
        }
            
    }
    
    public void notifyObserver(Observer o){
        o.update(observers.indexOf(o));
    }
    
    public int numberOfObservers(){
        return observers.size();
    }
   
    public Observer getNextObserver(){
        return observers.get(0) ;
    }
    
    @Override
    public String toString(){
        return "\nID: " + count + 
               "\nBook Title: " + title +
               "\nAuthor: " + author + 
               "\nGenre :" + genre +
               "\nYear of Publication: " + year +
               "\nEdition: " + edition;
               
        
    }
}