package sengassignment.Library.Filters;
import java.util.ArrayList;
import sengassignment.Library.Book;

public interface Filter {
    public ArrayList<Book> passFilter (ArrayList<Book> books, String filter);
}
