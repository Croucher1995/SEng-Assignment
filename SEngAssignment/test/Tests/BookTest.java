package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sengassignment.Library.Book;

/**
 *
 * @author Caroline
 */
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
}
