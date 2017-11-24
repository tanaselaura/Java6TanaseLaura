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
public class TriangleTest {
    
    public TriangleTest() {
    }

    /**
     * Test of getDefiniton method, of class Triangle.
     */
    @Test
    public void testGetDefiniton() {
        System.out.println("getDefiniton");
        Triangle instance = new Triangle();
        String expResult = "TRIANGLE: a plane figure with three straight sides and three angles. ";
        String result = instance.getDefiniton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
