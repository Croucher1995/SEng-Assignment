package sengassignment.Library.Filters;
import java.util.ArrayList;
import sengassignment.Library.*;

public class TitleFilter implements Filter{
    
    public ArrayList<Book> passFilter (ArrayList<Book> books, String filter){
        ArrayList<Book> reqdBooks = new ArrayList<Book>();
        
        for (Book book : books) {
            if (book.getBookTitle().toLowerCase().contains(filter.toLowerCase())) {
                reqdBooks.add(book);
            }
        }
        
        return reqdBooks;
    }
}
