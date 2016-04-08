package sengassignment.Library;
//import java.util.Calendar;
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
    
    //to initialise 
    public Book(){
        title = "";
        author = ""; 
        genre = "";
        year = 0;
        edition = 0;  
        onLoan = false;
        count =0;
    }
    
    //to create a new book in the library
    public Book(String title, String author, String genre, int year, int edition){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.edition = edition;
        this.year = year;
        //this.ID = UUID.randomUUID();
        count = count+1;
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
    
    public void setDate(Date d){     
        this.date = d;
    }
    
    public Date getLoanDate(){
        return this.date;
    }
    
    
    public boolean exceeds4Weeks(){
    	long fourweeksinmillis = 2419000000L;
    	long start = System.currentTimeMillis();
    	Date loanDate = this.getLoanDate();
    	long millisecond = loanDate.getTime();
    	if ((start - fourweeksinmillis) > millisecond)
    	{
    		return true;
    	}
    	else
    		return false;
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