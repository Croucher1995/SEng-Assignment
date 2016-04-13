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
    
    Catalogue c = new Catalogue();
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
    
    @Test
    public void testSearchByTitle() {
        assertTrue(c.searchByTitle("potter").contains(b1));
    }
    
    @Test
    public void testSearchByTitleNOTFOUND() {
       assertTrue(c.searchByTitle("Lord of the rings").isEmpty());
    }
    
    @Test
    public void testSearchByGenre(){
        assertTrue(c.searchByGenre(Fiction).size()==2);
        assertTrue(c.searchByGenre(Fiction).contains(b1)&&c.searchByGenre(Fiction).contains(b3));
    }
    
    @Test
    public void testSearchByGenreNOTFOUND(){
       assertTrue(c.searchByGenre(Romance).isEmpty());
    }
    
    @Test
    public void testSearchByYear(){
        assertTrue(c.searchByYearOfPublication(2000).contains(b2)&&c.searchByYearOfPublication(2000).contains(b3));
    }
    
    @Test
    public void testSearchByYearNOTFOUND(){
       assertTrue(c.searchByYearOfPublication(1995).isEmpty());
    }
 }
