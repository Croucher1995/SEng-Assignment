/*package Tests;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sengassignment.Library.Book;

public class BookTest {
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
    	Book b1 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals(1,b1.getBookID());
    }
    
    @Test
    public void testGetTitle() {
    	Book b2 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals("ABS",b2.getBookTitle());
    }
    
    @Test
    public void testGetAuthor() {
    	Book b3 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals("ab",b3.getBookAuthor());
    }
    
    @Test
    public void testGetEdition() {
    	Book b4 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals(2,b4.getBookEdition());
    }
    
    
    
    @Test
    public void testsetDate() {
    	Book b5 = new Book("ABS","ab","gujda",19,2);
    	Date d = new Date();
    	
    	b5.setLoanDate(d);
    	
        Assert.assertEquals(d,b5.getLoanDate());
    }
    /*
    @Test
    public void testToString() {
    	Book b6 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals("\nBook Title: " + "ABS" +
               "\nID: " + 6 + 
               "\nAuthor: " + "ab" + 
               "\nEdition: " + 2 +
               "\nYear of Publication: " + 19 +
               "\nGenre :" + "gujda",b6.toString());
    }
    */
    
//}

package Tests;

import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sengassignment.Library.Book;

public class BookTest {
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
    	Book b1 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals("ABS",b1.getBookTitle());
    }
    
    @Test
    public void testGetAuthor() {
    	Book b2 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals("ab",b2.getBookAuthor());
    }
    
    @Test
    public void testGetEdition() {
    	Book b3 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals(2,b3.getBookEdition());
    }
    
    @Test
    public void testGetBookID() {
    	Book b4 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals(4,b4.getBookID());
    }
    
    @Test
    public void testsetDate() {
    	Book b5 = new Book("ABS","ab","gujda",19,2);
    	Date d = new Date();
    	
    	b5.setLoanDate(d);
    	
        Assert.assertEquals(d,b5.getLoanDate());
    }
    
    @Test
    public void testToString() {
    	Book b6 = new Book("ABS","ab","gujda",19,2);
        Assert.assertEquals("\nBook Title: " + "ABS" +
               "\nID: " + 7 + 
               "\nAuthor: " + "ab" + 
               "\nEdition: " + 2 +
               "\nYear of Publication: " + 19 +
               "\nGenre :" + "gujda",b6.toString());
    }
    /*
    @Test
    public void testExceeds4Weeks() {
    	assertTrue();
    }*/
    
}