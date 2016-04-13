package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import sengassignment.Library.Book;
import sengassignment.Library.Library;
import sengassignment.Library.User;
import static org.junit.Assert.*;
import static sengassignment.Library.Genre.*;

public class LibraryTest {
    
    Library l = new Library();
    User u = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");
    User u1 = new User("Caroline","Caruana","Naxxar","carolinecaruana@gmail.com");
    User u2= new User("Clarke","Vella","Mosta","clarkevella@gmail.com");
    User u3 = new User("Charlie ","Borg","Mellieha","charlieborg@gmail.com");
    User u4 = new User("Denise","Cutajar","Hal Far","denisecutajar@gmail.com");
	
    
        
    public LibraryTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
        
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        l.addUser(u1);
    	l.addUser(u2);
    	l.addUser(u3);
    	l.addUser(u4);
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testaddUser() {
    	assertTrue(l.numberofUsers()==4);
        
        l.addUser(u);
        assertTrue(l.numberofUsers()==5);
    }
    
    @Test
    public void testremoveUser() {
    	assertTrue(l.numberofUsers() == 4);
    	
    	l.removeUser(u1);
    	assertTrue(l.numberofUsers()==3);

    }
    
    @Test
    public void testloanBooktoOKUSER() {
    	User u = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");
    	Book b = new Book("andre","ab",Fiction,1928,7);
    	l.loanBookTo(b, u);
    	assertTrue(l.getCheckLoan());
    }
    
    @Test
    public void testloanBooktoUSERWITH3BOOKS(){
        User u = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");
    	
        Book b1 = new Book("Harry Potter","J.K.Rowling",Fiction, 1997,7);
     	Book b2 = new Book("ABC","DEF",Fantasy,1945,7);
    	Book b3 = new Book("DEF","DEF",Fiction,1999,6);
     	Book b4 = new Book("DEF","DEF",Fiction,1999,6);
       
        l.loanBookTo(b1,u);
        l.loanBookTo(b2,u);
        l.loanBookTo(b3,u);
        
        assertTrue(l.getCheckLoan());
        
        l.loanBookTo(b4,u);
        
        assertFalse(l.getCheckLoan());
    }
    
    @Test
    public void testloanBooktoBOOKALREADYBORROWED(){
        User u1 = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");
        User u2 = new User("abc","def","Gudja","abcdef@gmail.com");
    	
        Book b = new Book("andre","ab",Fiction,1928,7);
        
        l.loanBookTo(b,u1);
        assertTrue(l.getCheckLoan());
        
        l.loanBookTo(b,u2);
        assertFalse(l.getCheckLoan());
    }
    
    @Test
    public void testloanBooktoEXCEEDED4WEEKS() throws InterruptedException{
        User u = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");    	
        Book b1 = new Book("andre","ab",Fiction,1928,7);
        Book b2 = new Book("andre","ab",Fiction,1928,7);

        l.loanBookTo(b1,u);
        assertTrue(l.getCheckLoan());
        
        Thread.sleep(3000); 
        
        /* This test works after doing the following
         * In class Library,
         * In method loanBookTo, 
         * when calling b.exceedsANumberOfWeeks, 
         * change the second parameter to 0.
        
         * This will make the amount of time for which the user can keep a book 0 seconds,
         * Since 3 seconds will have passed after the first loan, (by Thread.sleep(3000))
         * the loan will not be successful, as desired. 
        
         * If this is not done, to test this function, 4 weeks would have to pass to make sure it works correctly.
         */
        
        //Remove comment marks for next 2 lines after following the previous instructions 
        
       //l.loanBookTo(b2,u);
        //assertFalse(l.getCheckLoan());  
        
    }
    
    @Test
    public void testReturnBook() {
    	 User u = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");
    	 Book b = new Book("andre","ab",Fiction,1928,7);
    	 l.loanBookTo(b,u);
    	 l.returnBook(b);
    	 assertTrue(l.getCheckReturn());  	 
    }    
}
    
    

