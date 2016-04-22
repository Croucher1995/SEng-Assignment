package Tests;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sengassignment.Library.Book;
import sengassignment.Library.Catalogue;
import static sengassignment.Library.Genre.*;

public class CatalogueTest {
    
    Catalogue c = Catalogue.getInstance();
    
    Book b1 = new Book("HARRY POTTER", "J.K. ROWLING", Fiction, 1997, 5);
    Book b2 = new Book("THE KNIFE OF NEVER LETTING GO", "PATRICK NESS", Fantasy, 2000, 7);
    Book b3 = new Book("LADY MIDNIGHT", "CASSANDRA CLARE", Fiction, 2000, 7);
    Book b4 = new Book("GLASS SWORD", "VICTORIA AVEYARD", Action, 2016, 3);
    
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
}
