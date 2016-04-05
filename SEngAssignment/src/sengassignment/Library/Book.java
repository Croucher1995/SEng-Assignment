package sengassignment.Library;

import java.io.*;
import java.util.UUID;

public class Book {
    
    private String title;
    private String author; 
    private String genre;
    private int year;
    private int edition;  
    private UUID ID; 
    
    
    public Book(){
        title = "";
        author = ""; 
        genre = "";
        year = 0;
        edition = 0;  
    }
    
    public Book(String title, String author, String genre, int year, int edition){
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.edition = edition;
        this.ID = UUID.randomUUID();
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
}