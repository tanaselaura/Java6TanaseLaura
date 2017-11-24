/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laurici
 */
public class ScreenTest {
    
    public ScreenTest() {
    }

    /**
     * Test of display method, of class Screen.
     */
    @Test
    public void testDisplay() {
        System.out.println("display");
        String valueToDisplay = "Intoduce first operator";
        Screen instance = new Screen();
        instance.display(valueToDisplay);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of getScreenMemory method, of class Screen.
     */
    @Test
    public void testGetScreenMemory() {
        System.out.println("getScreenMemory");
        Screen instance = new Screen();
        String expResult = "Introduce second operator";
        instance.setScreenMemory("Introduce second operator");
        String result = instance.getScreenMemory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //ail("The test case is a prototype.");
    }

    /**
     * Test of setScreenMemory method, of class Screen.
     */
    @Test
    public void testSetScreenMemory() {
        System.out.println("setScreenMemory");
        String screenMemory = "Introduce second operator";
        Screen instance = new Screen();
        instance.setScreenMemory(screenMemory);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
