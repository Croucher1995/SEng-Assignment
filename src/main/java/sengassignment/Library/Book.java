package sengassignment.Library;
import java.util.Date;

public class Book {
    
    private String title;
    private String author; 
    private String genre;
    private int year;
    private int edition;  
    private static int count;
    private boolean onLoan;
    private Date date;
    
    User u = new User();
    
    final long msInAWeek = 604800000;
    
    //to initialise 
    public Book(){
        title = "";
        author = ""; 
        genre = "";
        year = 0;
        edition = 0;
        count =0;
        onLoan = false;
    }
    
    //to create a new book in the library
    public Book(String title, String author, String genre, int year, int edition){
        Date d = new Date();

        this.title = title;
        this.author = author;
        this.genre = genre;
        this.edition = edition;
        this.year = year;
        count = count+1;
        date = d;

    }
    
    //when a book is being loaned
    public void loanInfo(User u){
        this.u = u;
    }
    
    public User getLoanInfo(){
        return u;
    }
    
    public int getBookID(){
        return Book.count;
    }
    
    public String getBookTitle(){
        return this.title;
    }
     
    public String getBookAuthor(){
        return this.author;
    }
    
      public String getBookGenre(){
        return this.genre;
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
   
    
    public boolean isBorrowed()
    {
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
    
    @Override
    public String toString(){
        return "\nBook Title: " + title +
               "\nID: " + count + 
               "\nAuthor: " + author + 
               "\nEdition: " + edition +
               "\nYear of Publication: " + year +
               "\nGenre :" + genre;
        
    }
}