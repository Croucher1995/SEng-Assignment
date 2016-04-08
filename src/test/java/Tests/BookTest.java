package Tests;

import static org.junit.Assert.assertFalse;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static sengassignment.Library.Genre.*;
import sengassignment.Library.Book;

public class BookTest {
    
    Book b = new Book("The Martian","Andy Weir",ScienceFiction,2014,1);

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
    public void testGetBookID() {
        Assert.assertEquals(1,b.getBookID());
    }
    
    @Test
    public void testGetBookTitle() {
        Assert.assertEquals("The Martian",b.getBookTitle());
    }
    
    @Test
    public void testGetBookAuthor() {
        Assert.assertEquals("Andy Weir",b.getBookAuthor());
    }
    
    @Test
    public void testGetGenre() {
        Assert.assertEquals("Science Fiction",b.getBookGenre());
    }
    
    @Test
    public void testGetYear() {
        Assert.assertEquals(2014,b.getBookYear());
    }
    
    @Test
    public void testGetEdition() {
        Assert.assertEquals(1,b.getBookEdition());
    }
    
    @Test
    public void testsetDate() {
    	Date d = new Date();
    	b.setLoanDate(d);
        Assert.assertEquals(d,b.getLoanDate());
    }
    
    @Test
    public void testExceedsANumberOfWeeks() {
        Date d = new Date();
        b.setLoanDate(d);
        assertFalse(b.exceedsANumberOfWeeks(d.getTime(),4));
    }
    
    @Test
    public void testToString() {
        Assert.assertEquals("\nID: " + 1 + 
               "\nBook Title: " + "The Martian" +
               "\nAuthor: " + "Andy Weir" + 
               "\nGenre :" + "Science Fiction" +
               "\nYear of Publication: " + 2014 +
               "\nEdition: " + 1,b.toString());
    }
}