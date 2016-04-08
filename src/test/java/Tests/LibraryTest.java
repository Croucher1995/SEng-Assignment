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

public class LibraryTest {
    
Library l = new Library();
	
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
    
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void testaddUser() {
    	User u = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");
    	User u1 = new User("Caroline","Caruana","Gudja","dalemic@gmail.com");
    	User u2= new User("Romario","Catania","Gudja","croucherajkdhfa@gmail.com");
    	User u3 = new User("Dale ","Micallef","Gudja","danielfav@gmail.com");
    	User u4 = new User("Daniel","Fava","Gudja","carcar@gmail.com");
    
    	assertTrue(l.numberofUsers() == 0);
    	
    	l.addUser(u);
    	assertTrue(l.numberofUsers()==1);
    	l.addUser(u1);
    	l.addUser(u2);
    	l.addUser(u3);
    	l.addUser(u4);
    	assertTrue(l.numberofUsers()==5);
    	
    }
    
    @Test
    public void testremoveUser() {
    	User u = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");
    	User u1 = new User("Caroline","Caruana","Gudja","dalemic@gmail.com");
    	User u2= new User("Romario","Catania","Gudja","croucherajkdhfa@gmail.com");
    	User u3 = new User("Dale ","Micallef","Gudja","danielfav@gmail.com");
    	User u4 = new User("Daniel","Fava","Gudja","carcar@gmail.com");
    
    	assertTrue(l.numberofUsers() == 0);
    	
    	l.addUser(u);
    	assertTrue(l.numberofUsers()==1);
    	l.addUser(u1);
    	l.addUser(u2);
    	l.addUser(u3);
    	l.addUser(u4);
    	assertTrue(l.numberofUsers()==5);
    	l.removeUser(u);
    	assertTrue(l.numberofUsers()==4);
    	l.removeUser(u1);
    	l.removeUser(u2);
    	l.removeUser(u3);
    	l.removeUser(u4);
    	assertTrue(l.numberofUsers()==0);

    }
    
    @Test
    public void testloanBooktoOKUSER() {
    	User u = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");
    	Book b = new Book("andre","ab","fiction",1928,7);
    	l.loanBookTo(b, u);
    	assertTrue(l.getCheckLoan());
    }
    
    @Test
    public void testloanBooktoUSERWITH3BOOKS(){
        User u = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");
    	
        Book b1 = new Book("andre","ab","fiction",1928,7);
     	Book b2 = new Book("ABC","DEF","fantasy",1945,7);
    	Book b3 = new Book("DEF","DEF","fiction",1999,6);
     	Book b4 = new Book("DEF","DEF","fiction",1999,6);

       
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
    	
        Book b = new Book("andre","ab","fiction",1928,7);
        
        l.loanBookTo(b,u1);
        assertTrue(l.getCheckLoan());
        
        l.loanBookTo(b,u2);
        assertFalse(l.getCheckLoan());
        
    }
    
    
    @Test
    public void testReturnBook() {
    	 User u = new User("Andre","Croucher","Gudja","andrecroucher@gmail.com");
    	 Book b = new Book("andre","ab","fiction",1928,7);
    	 l.loanBookTo(b,u);
    	 l.returnBook(b);
    	 assertTrue(l.getCheckReturn());
    	 
    }
    
    }
    
    

