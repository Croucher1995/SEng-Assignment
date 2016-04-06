package sengassignment.Library;
import java.util.ArrayList;

public class Catalogue {
    
    Book b = new Book ();
    
    ArrayList <Book> book_names = new ArrayList<>();
    
    
    public Catalogue() {
        
    }
    
    public Catalogue(Book b)
    {
        book_names.add(b);
    }
    
    public ArrayList getAllBooks() {
        return book_names;

    }
    
    public String searchByTitle(String names){
        for (Book book_name : book_names) {
            if ((book_name.getBookTitle()).contains(names)) {
                return book_name.getBookTitle();
            }
        }
        return "";
    }
    
    public String searchByGenre(String names){
        for (Book book_name : book_names) {
            if ((book_name.getBookGenre()).contains(names)) {
                return book_name.getBookTitle();
            }
        }
        return "";
    }
    
    public String searchByYearOfPublication(int year){
        for (Book book_name : book_names) {
            if ((book_name.getBookYear())==year) {
                return book_name.getBookTitle();
            }
        }
        return "";
    }
}
