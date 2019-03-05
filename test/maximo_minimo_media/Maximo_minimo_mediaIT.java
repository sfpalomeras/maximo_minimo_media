package maximo_minimo_media;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sergio
 */
public class Maximo_minimo_mediaIT {
    
    public Maximo_minimo_mediaIT() {
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

    /**
     * Test of maximo method, of class Maximo_minimo_media.
     */
    @Test
    public void testMaximo() {
        System.out.println("maximo");
        int x = -1000;
        int y = -600;
        int expResult = -1000;
        int result = Maximo_minimo_media.maximo(x, y);
        assertEquals(expResult, result);
    }

    @Test
    public void testMinimo() {
        System.out.println("minimo");
        int x = 200;
        int y = 300;
        int expResult = 200;
        int result = Maximo_minimo_media.minimo(x, y);
        assertEquals(expResult, result);

    }

    @Test
    public void testMedia() {
        System.out.println("media");
        int w = 0;
        int x = 0;
        int y = 0;
        int z = 0;
        Maximo_minimo_media instance = new Maximo_minimo_media();
        int expResult = 0;
        int result = instance.media(w, x, y, z);
        assertEquals(expResult, result);

    }

    /**
     * Test of main method, of class Maximo_minimo_media.
     */
    
    


    
}
