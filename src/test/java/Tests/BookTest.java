package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sengassignment.Library.Book;

public class BookTest {
    Book b = new Book();
    public BookTest() {
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
    public void testGetTitle() {
        Assert.assertEquals("",b.getBookTitle());
    }
    
    @Test
    public void testGetAuthor() {
        Assert.assertEquals("ABC",b.getBookAuthor());
    }
    
    @Test
    public void testGetBookID() {
    	Book b2 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals(1,b2.getBookID());
    }
}
