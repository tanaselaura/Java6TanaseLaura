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
public class CircleTest {
    
    public CircleTest() {
    }

    /**
     * Test of getDefiniton method, of class Circle.
     */
    @Test
    public void testGetDefiniton() {
        System.out.println("getDefiniton");
        Circle instance = new Circle();
        String expResult = "CIRCLE: a plane figure whose boundary (the circumference) consists of\n" +
"points equidistant from a fixed point (the centre). ";
        String result = instance.getDefiniton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
