package sengassignment.Library;
import java.util.ArrayList;
import static sengassignment.Library.Genre.*;

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
        ArrayList<Book> temp = new ArrayList<Book>();    
        for (Book book_name : book_names) {
            for(int i = 0; i<f.getFilters().size(); i++){
                if(book_name.getBookTitle().toLowerCase().contains(f.getFTitle()))
                    if(book_name.getBookAuthor().toLowerCase().contains(f.getFAuthor()))
                        if(book_name.getBookGenre()==(f.getFGenre()) || f.getFGenre() == Default)
                            if(book_name.getBookYear()==(f.getFYear()) || f.getFYear()==0)
                                if(book_name.getBookEdition()==(f.getFEdition()) || f.getFEdition()==0)
                                    temp.add(book_name);
                                    
            }  
        }
        System.out.println(temp.size());

        return temp;
    }
    
}