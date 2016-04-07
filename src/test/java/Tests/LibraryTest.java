package Tests;

//import java.util.ArrayList;

//import junit.framework.Assert;


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;



import sengassignment.Library.Book;
//import sengassignment.Library.Catalogue;
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
    public void testloanBookto() {
    	
    }
    
    @Test
    public void testReturnBook() {
    }
    
    }

