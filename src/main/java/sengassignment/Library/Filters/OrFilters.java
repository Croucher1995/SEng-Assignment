package sengassignment.Library.Filters;

import java.util.ArrayList;
import sengassignment.Library.*;

public class OrFilters implements Filter{
    Filter title;
    Filter author;
    Filter genre;
    Filter year;
    Filter edition;
    
    String titleFilter;
    String authorFilter;
    String genreFilter;
    String yearFilter;
    String editionFilter;
    
        
    public OrFilters(Filter title, String titleFilter, Filter author, String authorFilter,
            Filter genre, String genreFilter, Filter year, String yearFilter, 
            Filter edition, String editionFilter){
        
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.year = year;
        this.edition = edition;
       
        this.titleFilter = titleFilter;
        this.authorFilter = authorFilter;
        this.genreFilter = genreFilter;
        this.yearFilter = yearFilter;
        this.editionFilter = editionFilter;
        
    }
    
    public ArrayList<Book> passFilter (ArrayList<Book> books, String filter){
        ArrayList<Book> books1 = title.passFilter(books, titleFilter);
        ArrayList<Book> books2 = author.passFilter(books, authorFilter);
        ArrayList<Book> books3 = genre.passFilter(books, genreFilter);
        ArrayList<Book> books4 = year.passFilter(books, yearFilter);
        ArrayList<Book> books5 = edition.passFilter(books, editionFilter);
        
        for (Book book2 : books2) {
            if (!books1.contains(book2)) {
                books1.add(book2);
            }            
        }
        
        for (Book book3 : books3) {
            if (!books1.contains(book3)) {
                books1.add(book3);
            }            
        }
        for (Book book4 : books4) {
            if (!books1.contains(book4)) {
                books1.add(book4);
            }            
        }
        for (Book book5 : books5) {
            if (!books1.contains(book5)) {
                books1.add(book5);
            }            
        }
        
        return books1;
    }
}
