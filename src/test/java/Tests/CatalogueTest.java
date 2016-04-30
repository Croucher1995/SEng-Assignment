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
    
    Book b1 = new Book("HARRY POTTER", "J.K. ROWLING", Fiction, 1997, 1);
    Book b2 = new Book("THE KNIFE OF NEVER LETTING GO", "PATRICK NESS", Fantasy, 2000, 7);
    Book b3 = new Book("LADY MIDNIGHT", "CASSANDRA CLARE", Fiction, 2000, 7);
    Book b4 = new Book("GLASS SWORD", "VICTORIA AVEYARD", Action, 2016, 3);
    Book b5 = new Book("THE HITCHHIKER'S GUIDE TO THE GALAXY", "DOUGLAS ADAMS", ScienceFiction, 1979, 3);
    Book b6 = new Book("NIGHTRISE", "ANTHONY HOROWITZ", Fiction, 2007, 2);
    Book b7 = new Book("OBLIVION", "ANTHONY HOROWITZ", Fiction, 2013, 1);
    Book b8 = new Book("READY PLAYER ONE", "ERNEST CLINE", ScienceFiction, 2011, 2);
   
    
    Filter title = new TitleFilter();
    Filter author = new AuthorFilter();
    Filter genre = new GenreFilter();
    Filter year = new YearFilter();
    Filter edition = new EditionFilter();
    
    
    Filter f1 = new AndFilters(title, "",author,"ANTHONY HOROWITZ",genre,"Default",year,"0",edition,"0"); 
    Filter f2 = new AndFilters(title, "",author,"",genre,"Fiction",year,"0",edition,"0");
    
    Filter f3 = new AndFilters(title, "NIGHT",author,"",genre,"Fiction",year,"0",edition,"0");
    Filter f4 = new AndFilters(title, "", author, "", genre, "SCIENCEFICTION", year, "0", edition, "1");
    
    Filter f5 = new OrFilters(title, "",author,"ROWLING",genre,"Fiction",year,"0",edition,"0");
    Filter f6 = new OrFilters(title, "",author,"",genre,"Fiction",year,"2000",edition,"1");

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
        c.addBooks(b5);
        c.addBooks(b6);
        c.addBooks(b7);
        c.addBooks(b8);
    }
    
    @After
    public void tearDown() {}
    
    @Test
    public void testGetAllBooks() { 
        assertTrue(c.getAllBooks().contains(b1)&&c.getAllBooks().contains(b2)&&c.getAllBooks().contains(b3)&&c.getAllBooks().contains(b4)
                    &&c.getAllBooks().contains(b5)&&c.getAllBooks().contains(b6)&&c.getAllBooks().contains(b7));  
    }
    
    @Test
    public void testOneFilter_1(){
        //Expecting all books by Anthony Horowitz
        assertTrue(c.searchForBooks(f1).contains(b6)&&c.searchForBooks(f1).contains(b7));  
    } 
    
    @Test
    public void testOneFilter_2(){
        //Expecting all fiction books
        assertTrue(c.searchForBooks(f2).contains(b1)&&c.searchForBooks(f2).contains(b3)
                    &&c.searchForBooks(f2).contains(b6)&&c.searchForBooks(f2).contains(b7));
    }
    
    @Test 
    public void testTwoFilters_1(){
        //Expecting all Fiction books with 'night' in the title
        assertTrue(c.searchForBooks(f3).contains(b3)&&c.searchForBooks(f3).contains(b6));
    }
    
    
    /*    @Test
    public void testTwoFilters_1(){
    //Expecting all Fiction books with the word 'NIGHT' in the title
    assertTrue(c.searchForBooks(f3).contains(b3)&&c.searchForBooks(f3).contains(b6));
    }
    
    @Test
    public void testTwoFilters_2(){
    //Expecting all 1st edition, ScienceFiction books
    assertTrue(c.searchForBooks(f2).contains(b3)&&c.searchForBooks(f2).contains(b6));
    }*/
    /*
    @Test
    public void testTwoFilters_1(){
    //Expecting all Fiction books with the word 'NIGHT' in the title
    assertTrue(c.searchForBooks(f3).contains(b3)&&c.searchForBooks(f3).contains(b6));
    }
    
    @Test
    public void testTwoFilters_2(){
    //Expecting all 1st edition, ScienceFiction books
    assertTrue(c.searchForBooks(f2).contains(b3)&&c.searchForBooks(f2).contains(b6));
    }
    */
    /*
    
    @Test
    public void testFilter4(){
    assertTrue(c.searchForBooks(f4).contains(b2)&&c.searchForBooks(f4).contains(b3)&&c.searchForBooks(f4).contains(b1)&&c.searchForBooks(f4).contains(b4));
    }*/
}