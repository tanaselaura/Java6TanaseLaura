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
public class SquareTest {
    
    public SquareTest() {
    }

    /**
     * Test of getDefiniton method, of class Square.
     */
    @Test
    public void testGetDefiniton() {
        System.out.println("getDefiniton");
        Square instance = new Square();
        String expResult = "SQUARE: a plane figure with four equal straight sides and four right angles. ";
        String result = instance.getDefiniton();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
