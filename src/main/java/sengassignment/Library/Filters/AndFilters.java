package sengassignment.Library.Filters;

import java.util.ArrayList;
import sengassignment.Library.*;

public class AndFilters implements Filter{
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
    
        
    public AndFilters(Filter title, String titleFilter, Filter author, String authorFilter,
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
        ArrayList<Book> books2 = author.passFilter(books1, authorFilter);
        ArrayList<Book> books3 = author.passFilter(books2, genreFilter);
        ArrayList<Book> books4 = author.passFilter(books3, yearFilter);
        ArrayList<Book> books5 = author.passFilter(books4, editionFilter);
        
        return books5;
    }
}
