package Tests;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import sengassignment.Library.Genre;


public class GenreTest {
    Genre g = new Genre();
    public GenreTest() {
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
    public void testGetType() {
        Assert.assertEquals("FICTION",g.getType());
    }
    
    @Test
    public void testGere_Description() {
        Assert.assertEquals("A STORY FILLED WITH IMAGINATION",g.getGenre_Description());
    }
 }
