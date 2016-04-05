package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import sengassignment.Library.User;

public class UserTest {
    User u = new User();
    public UserTest() {
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
    public void testGetUserName() {
        Assert.assertEquals("ANDRE",u.getUserName());
    }
    
    @Test
    public void testGetUserSurname() {
        Assert.assertEquals("CROUCH",u.getUserSurname());
    }
    
    
    @Test
    public void testGetUserTown() {
        Assert.assertEquals("RABAT",u.getUserTown());
    }
    
    
    @Test
    public void testGetUserEmail() {
        Assert.assertEquals("acrouch@gmail.com",u.getUserEmail());
    }

}
