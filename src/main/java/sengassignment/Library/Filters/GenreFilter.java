package sengassignment.Library.Filters;
import java.util.ArrayList;
import sengassignment.Library.*;

public class GenreFilter implements Filter{
    
    public ArrayList<Book> passFilter (ArrayList<Book> books, String filter){
        ArrayList<Book> reqdBooks = new ArrayList<Book>();
        
        for (Book book : books) {
            if (book.getBookGenre().toString().toLowerCase().contains(filter.toLowerCase()) || "default".equals(filter.toLowerCase() )) {
                reqdBooks.add(book);
            }
        }
        
        return reqdBooks;
    }
}
