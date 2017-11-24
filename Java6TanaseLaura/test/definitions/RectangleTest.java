/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package definitions;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laurici
 */
public class RectangleTest {
    
    public RectangleTest() {
    }

    /**
     * Test of getDefiniton method, of class Rectangle.
     */
    @Test
    public void testGetDefiniton() {
        System.out.println("getDefiniton");
        Rectangle instance = new Rectangle();
        String expResult = "RECTANGLE: a plane figure with four straight sides and four right angles,\n" +
"especially one with unequal adjacent sides, in contrast to a square.";
        String result = instance.getDefiniton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
