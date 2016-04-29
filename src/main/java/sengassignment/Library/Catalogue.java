package sengassignment.Library;
import sengassignment.Library.Filters.Filter;
import java.util.ArrayList;

public class Catalogue {
    private static Catalogue instance = null;
    
    ArrayList <Book> book_names = new ArrayList<Book>();
    Book b1 = new Book();
    
    private Catalogue() {
    }

    public static Catalogue getInstance(){
        if(instance==null)
            instance = new Catalogue();
        return instance; 
    }
    
    public void addBooks(Book b){
        book_names.add(b);
    }
    
    public ArrayList<Book> getAllBooks() {
        return book_names;
    }
    
    public ArrayList<Book> searchForBooks(Filter f){
        
        return f.passFilter(book_names, "");
    }
    
}