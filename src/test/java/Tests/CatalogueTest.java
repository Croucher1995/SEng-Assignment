package Tests;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sengassignment.Library.Book;
import sengassignment.Library.Catalogue;
import sengassignment.Library.Filters.*;
import sengassignment.Library.Filters.Filter;
import static sengassignment.Library.Genre.*;

public class CatalogueTest {
    
    Catalogue c = Catalogue.getInstance();
    
    Book b1 = new Book("HARRY POTTER", "J.K. ROWLING", Fiction, 1997, 5);
    Book b2 = new Book("THE KNIFE OF NEVER LETTING GO", "PATRICK NESS", Fantasy, 2000, 7);
    Book b3 = new Book("THE LADY MIDNIGHT", "CASSANDRA CLARE", Fiction, 2000, 7);
    Book b4 = new Book("THE GLASS SWORD", "VICTORIA AVEYARD", Action, 2016, 3);
    
    Filter title = new TitleFilter();
    Filter author = new AuthorFilter();
    Filter genre = new GenreFilter();
    Filter year = new YearFilter();
    Filter edition = new EditionFilter();
    
    Filter f1 = new AndFilters(title, "the",author,"",genre,"Default",year,"0",edition,"0");
    Filter f2 = new AndFilters(title, "THE",author,"",genre,"Default",year,"2000",edition,"0");
    Filter f3 = new AndFilters(title, "THE",author,"",genre,"Fantasy",year,"0",edition,"0");
    
    Filter f4 = new OrFilters(title, "THE",author,"",genre,"Default",year,"1997",edition,"0");

    public CatalogueTest() {}
    
    @BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() {}
    
    @Before
    public void setUp() {
        c.addBooks(b1);
        c.addBooks(b2);
        c.addBooks(b3);
        c.addBooks(b4);
    }
    
    @After
    public void tearDown() {}
    
    @Test
    public void testGetAllBooks() { 
        assertTrue(c.getAllBooks().contains(b1)&&c.getAllBooks().contains(b2)&&c.getAllBooks().contains(b3)&&c.getAllBooks().contains(b4));  
    }
    
    @Test
    public void testFilter1(){
        assertTrue(c.searchForBooks(f1).contains(b4)&&c.searchForBooks(f1).contains(b2)&&c.searchForBooks(f1).contains(b3));  
    } 
    
    @Test
    public void testFilter2(){
        assertTrue(c.searchForBooks(f2).contains(b2)&&c.searchForBooks(f2).contains(b3));  
    }
    
    
    @Test
    public void testFilter4(){
        assertTrue(c.searchForBooks(f4).contains(b2)&&c.searchForBooks(f4).contains(b3)&&c.searchForBooks(f4).contains(b1)&&c.searchForBooks(f4).contains(b4));  
    }
}