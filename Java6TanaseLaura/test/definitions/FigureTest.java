/*
 * Test for figure
 */
package definitions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 *Testing
 */
public class FigureTest {
    
    public FigureTest() {
    }

    /**
     * Test of getDefiniton method, of class Figure.
     */
    @Test
    public void testGetDefiniton() {
        System.out.println("getDefiniton");
        Figure instance = new Figure();
        String expResult = "a plane figure ";
        String result = instance.getDefiniton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
