/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Caroline
 */
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
        Assert.assertEquals("ANDRE",b.getUserName());
    }
    
    @Test
    public void testGetUserSurname() {
        Assert.assertEquals("CROUCH",b.getUserSurname());
    }
    
    
    @Test
    public void testGetUserTown() {
        Assert.assertEquals("RABAT",b.getUserTown());
    }
    
    
    @Test
    public void testGetUserEmail() {
        Assert.assertEquals("acrouch@gmail.com",b.getUserEmail());
    }

}
