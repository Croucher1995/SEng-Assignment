/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sengassignment.Library;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Arrays;

/**
 *
 * @author Caroline
 */
public class Catalogue {
    
    Book b = new Book ();
    
    ArrayList <b> book_names = new ArrayList<b>();
    
    
    public Catalogue() {
        
    }
    
    public Catalogue(Book b)
    {
        book_names.add(b);
    }
    
    public String getAllBooks() {
        for (int i=0; i< book_names.size(); i++)
        {
            System.out.println(book_names.get(i));
        }
    }
    
    public String searchByTitle(String names){
        for (int i=0; i< book_names.size(); i++)
        {
            if (book_names.contains(names))
            {
                return names;
            }
        }
    }
    
    public String searchByGenre(String genre){
        for (int i=0; i< book_names.size(); i++)
        {
            if (book_names.contains(genre))
            {
                return genre;
            }
        }
    }
    
    public int searchByYearOfPublication(int year){
        for (int i=0; i< book_names.size(); i++)
        {
            if (book_names.contains(year))
            {
                return year;
            }
        }
    }
    
}
