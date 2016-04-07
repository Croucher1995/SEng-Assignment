package Tests;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sengassignment.Library.Book;
import sengassignment.Library.Catalogue;


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
        Book b1 = new Book("ABC", "AUTHOR", "FICTION", 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", "FANTASY", 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", "FICTION", 2000, 7);
        Book b4 = new Book("EF", "AUTHOR", "ACTION", 1948, 7);

        ArrayList <Book> book_names = new ArrayList<>();

        book_names.add(b1);
        book_names.add(b2);
        book_names.add(b3);
        book_names.add(b4);
        
        //ASSERT ARRAY EQUALS 
        Assert.assertEquals(b1,book_names.get(0));
    }
    
    @Test
    public void testSearchByTitle() {
        Book b1 = new Book("ABC", "AUTHOR", "FICTION", 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", "FANTASY", 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", "FICTION", 2000, 7);
        Book b4 = new Book("EF", "AUTHOR", "ACTION", 1948, 7);

        ArrayList <Book> book_names = new ArrayList<>();

        book_names.add(b1);
        book_names.add(b2);
        book_names.add(b3);
        book_names.add(b4);
                
        ArrayList<Book> temp = new ArrayList<>();
        
        temp.add(b3);
        temp.add(b4);
        
        Book [] temparray = temp.toArray(new Book[temp.size()]);
    
        Assert.assertArrayEquals(temparray,c.searchByTitle("EF").toArray());
    }
    
    
    @Test
    public void testSearchByGenre(){
        Book b1 = new Book("ABC", "AUTHOR", "FICTION", 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", "FANTASY", 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", "FICTION", 2000, 7);
        Book b4 = new Book("EF", "AUTHOR", "ACTION", 1948, 7);

        ArrayList <Book> book_names = new ArrayList<>();

        book_names.add(b1);
        book_names.add(b2);
        book_names.add(b3);
        book_names.add(b4);
        
        ArrayList<Book> temp = new ArrayList<>();
        
        temp.add(b2);
        //temp.add(b3);
        
        Book [] temparray = temp.toArray(new Book[temp.size()]);
        
        Assert.assertArrayEquals(temparray, c.searchByGenre("FANTASY").toArray());
    }
    
    @Test
    public void testSearchByYear(){
        Book b1 = new Book("ABC", "AUTHOR", "FICTION", 1948, 7);
        Book b2 = new Book("ABCD", "AUTHOR", "FANTASY", 1959, 7);
        Book b3 = new Book("DEF", "AUTHOR", "FICTION", 2000, 7);
        Book b4 = new Book("EF", "AUTHOR", "ACTION", 1948, 7);
        
        ArrayList <Book> book_names = new ArrayList<>();
        
        book_names.add(b1);
        book_names.add(b2);
        book_names.add(b3);
        book_names.add(b4);
        
        ArrayList<Book> temp = new ArrayList<>();
        
        temp.add(b1);
        temp.add(b4);
        
        Book [] temparray = temp.toArray(new Book[temp.size()]);
        
        Assert.assertArrayEquals(temparray, c.searchByYearOfPublication(1948).toArray());
    }
    
    
 }
