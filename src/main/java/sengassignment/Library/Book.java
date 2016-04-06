package sengassignment.Library;

import java.util.Date;
import java.util.UUID;

public class Book {
    
    private String title;
    private String author; 
    private String genre;
    private int year;
    private int edition;  
    private UUID ID; 
    private boolean onLoan;
    private String date;
    
    User u = new User();
    
    //to initialise 
    public Book(){
        title = "";
        author = "ABC"; 
        genre = "";
        year = 0;
        edition = 0;  
        onLoan = false;
    }
    
    //to create a new book in the library
    public Book(String title, String author, String genre, int year, int edition){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.edition = edition;
        this.ID = UUID.randomUUID();
    }
    
    //when a book is being loaned
    public Book(User u){
        
        Date d = new Date();
     
        this.u = u;
        this.onLoan = true;
        this.date = d.toString();
    }
    
    
    public UUID getBookID(){
        return this.ID;
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
    
    public String getBookDate(){
        return this.date;
    }
    
    public boolean isBorrowed()
    {
        if (onLoan) {
            return true;
        }
        else{
            return false;
        }
    }
    
    @Override
    public String toString(){
        return "\nBook Title: " + title +
               "\nID: " + ID + 
               "\nAuthor: " + author + 
               "\nEdition: " + edition +
               "\nYear of Publication: " + year;
        
    }
}