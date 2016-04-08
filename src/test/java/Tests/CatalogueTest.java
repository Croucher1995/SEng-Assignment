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
    
    
    public CatalogueTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
            
       
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testGetAllBooks() {
        Book b1 = new Book("ABC", "AUTHOR", Fiction, 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", Fantasy, 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", Fiction, 2000, 7);
        Book b4 = new Book("", "AUTHOR", Action, 1948, 7);

        c.addBooks(b1);
        c.addBooks(b2);
        c.addBooks(b3);
        c.addBooks(b4); 
       
        assertTrue(c.getAllBooks().contains(b1)&&c.getAllBooks().contains(b2)&&c.getAllBooks().contains(b3)&&c.getAllBooks().contains(b4));

        
    }
    
    @Test
    public void testSearchByTitle() {
        Book b1 = new Book("ABC", "AUTHOR", Fiction, 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", Fantasy, 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", Fiction, 2000, 7);
        Book b4 = new Book("", "AUTHOR", Action, 1948, 7);

        c.addBooks(b1);
        c.addBooks(b2);
        c.addBooks(b3);
        c.addBooks(b4);
          
        assertTrue(c.searchByTitle("AB").contains(b1)&&c.searchByTitle("AB").contains(b2));
    }
    
    @Test
    public void testSearchByTitleNOTFOUND() {
        Book b1 = new Book("ABC", "AUTHOR", Fiction, 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", Fantasy, 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", Fiction, 2000, 7);
        Book b4 = new Book("", "AUTHOR", Action, 1948, 7);

        c.addBooks(b1);
        c.addBooks(b2);
        c.addBooks(b3);
        c.addBooks(b4);
          
        assertTrue(c.searchByTitle("GHI").isEmpty());
    }
    
    @Test
    public void testSearchByGenre(){
        Book b1 = new Book("ABC", "AUTHOR", Fiction, 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", Fantasy, 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", Fiction, 2000, 7);
        Book b4 = new Book("", "AUTHOR", Action, 1948, 7);

        c.addBooks(b1);
        c.addBooks(b2);
        c.addBooks(b3);
        c.addBooks(b4);
    
        assertTrue(c.searchByGenre("FICTION").size()==2);
        assertTrue(c.searchByGenre("FICTION").contains(b1)&&c.searchByGenre("FICTION").contains(b3));
    }
    
    @Test
    public void testSearchByGenreNOTFOUND(){
        Book b1 = new Book("ABC", "AUTHOR", Fiction, 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", Fantasy, 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", Fiction, 2000, 7);
        Book b4 = new Book("", "AUTHOR", Action, 1948, 7);

        c.addBooks(b1);
        c.addBooks(b2);
        c.addBooks(b3);
        c.addBooks(b4);
    
        assertTrue(c.searchByGenre("BIOGRAPHY").isEmpty());
    }
    
    @Test
    public void testSearchByYear(){
        Book b1 = new Book("ABC", "AUTHOR", Fiction, 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", Fantasy, 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", Fiction, 2000, 7);
        Book b4 = new Book("", "AUTHOR", Action, 1948, 7);

        c.addBooks(b1);
        c.addBooks(b2);
        c.addBooks(b3);
        c.addBooks(b4);
    
        assertTrue(c.searchByYearOfPublication(1948).contains(b1)&&c.searchByYearOfPublication(1948).contains(b4));
    }
    
    @Test
    public void testSearchByYearNOTFOUND(){
        Book b1 = new Book("ABC", "AUTHOR", Fiction, 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", Fantasy, 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", Fiction, 2000, 7);
        Book b4 = new Book("", "AUTHOR", Action, 1948, 7);

        c.addBooks(b1);
        c.addBooks(b2);
        c.addBooks(b3);
        c.addBooks(b4);
    
        assertTrue(c.searchByYearOfPublication(333333).isEmpty());
    }
 }
