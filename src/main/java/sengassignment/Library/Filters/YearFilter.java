package sengassignment.Library.Filters;
import java.util.ArrayList;
import sengassignment.Library.*;

public class YearFilter implements Filter{
    
    public ArrayList<Book> passFilter (ArrayList<Book> books, String filter){
        ArrayList<Book> reqdBooks = new ArrayList<Book>();
        
        for (Book book : books) {     
            if (book.getBookYear() == Integer.parseInt(filter)||"0".equals(filter)) {
                reqdBooks.add(book);
            }
        }
        
        return reqdBooks;
    }
}
