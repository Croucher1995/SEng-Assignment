package sengassignment.Library;
import java.util.ArrayList;

public class Catalogue {
    
    Book b1 = new Book("ABC", "AUTHOR", "FICTION", 1948, 7);
    Book b2 = new Book("ABCD", "AUTHOR", "FANTASY", 1959, 7);
    Book b3 = new Book("DEF", "AUTHOR", "FICTION", 2000, 7);
    Book b4 = new Book("EF", "AUTHOR", "ACTION", 1948, 7);
    
    ArrayList <Book> book_names = new ArrayList<>();
    
    public Catalogue() {
        book_names.add(b1);
        book_names.add(b2);
        book_names.add(b3);
        book_names.add(b4);
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
