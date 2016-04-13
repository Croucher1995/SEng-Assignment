package sengassignment.Library;
import java.util.ArrayList;

public class Catalogue {
    ArrayList <Book> book_names = new ArrayList<Book>();
    Book b1 = new Book();
    
    public Catalogue() {
    }

    public void addBooks(Book b){
        book_names.add(b);
    }
    
    public ArrayList<Book> getAllBooks() {
        return book_names;
    }
    
    public ArrayList<Book> searchByTitle(String names){
        ArrayList<Book> temp = new ArrayList<Book>();
        for (Book book_name : book_names) {
            if ((book_name.getBookTitle()).toLowerCase().contains(names)) {
                temp.add(book_name);
            }
        }
        return temp;
    }
    
    public ArrayList<Book> searchByGenre(Genre names){
        ArrayList<Book> temp = new ArrayList<Book>();
        for (Book book_name : book_names) {
            if ((book_name.getBookGenre())==names) {
                temp.add(book_name);
            }
        }
        return temp;
    }
    
    public ArrayList<Book> searchByYearOfPublication(int year){
        ArrayList<Book> temp = new ArrayList<Book>();
        for (Book book_name : book_names) {
            if ((book_name.getBookYear())==year) {
                temp.add(book_name);
            }
        }
        return temp;
    }
}