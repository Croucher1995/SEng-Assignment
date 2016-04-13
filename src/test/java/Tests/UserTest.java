package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sengassignment.Library.User;

public class UserTest {
    User u = new User("ANDRE", "CROUCHER", "RABAT", "andrecroucher@gmail.com" );
    
    public UserTest() {}
    
    @BeforeClass
    public static void setUpClass() {}
    
    @AfterClass
    public static void tearDownClass() {}
    
    @Before
    public void setUp() {}
    
    @After
    public void tearDown() {}
    
    @Test
    
    public void testGetUserName() {
        Assert.assertEquals("ANDRE",u.getUserName());
    }
    
    @Test
    public void testGetUserSurname() {
        Assert.assertEquals("CROUCHER",u.getUserSurname());
    }
    
    
    @Test
    public void testGetUserTown() {
        Assert.assertEquals("RABAT",u.getUserTown());
    }
    
    
    @Test
    public void testGetUserEmail() {
        Assert.assertEquals("andrecroucher@gmail.com",u.getUserEmail());
    }
    
    @Test
    public void testGetUserID() {
        Assert.assertEquals(1,u.getUserID());
    }
}
