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
public class FrameTest {
    
    public FrameTest() {
    }

    /**
     * Test of start method, of class Frame.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        Frame instance = new Frame();
        instance.start();
        String valAfisat = instance.getEcran().getScreenMemory();
        assertEquals(null, valAfisat);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of afiseazaOperand method, of class Frame.
     */
    @Test
    public void testAfiseazaOperand() {
        System.out.println("afiseazaOperand");
        Frame instance = new Frame();
        instance.afiseazaOperand();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of afiseazaOoperator method, of class Frame.
     */
    @Test
    public void testAfiseazaOoperator() {
        System.out.println("afiseazaOoperator");
        Frame instance = new Frame();
        instance.afiseazaOoperator();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of afiseazaequal method, of class Frame.
     */
    @Test
    public void testAfiseazaequal() {
        System.out.println("afiseazaequal");
        Frame instance = new Frame();
        instance.afiseazaequal();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of afiseazaRezultat method, of class Frame.
     */
    @Test
    public void testAfiseazaRezultat() {
        System.out.println("afiseazaRezultat");
        Frame instance = new Frame();
        instance.afiseazaRezultat();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getEcran method, of class Frame.
     */
    @Test
    public void testGetEcran() {
        System.out.println("getEcran");
        Frame instance = new Frame();
        Screen expResult = null;
        Screen result = instance.getEcran();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setEcran method, of class Frame.
     */
    @Test
    public void testSetEcran() {
        System.out.println("setEcran");
        Screen ecran = null;
        Frame instance = new Frame();
        instance.setEcran(ecran);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getButon method, of class Frame.
     */
    @Test
    public void testGetButon() {
        System.out.println("getButon");
        Frame instance = new Frame();
        Button[] expResult = null;
        Button[] result = instance.getButon();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setButon method, of class Frame.
     */
    @Test
    public void testSetButon() {
        System.out.println("setButon");
        Button[] buton = null;
        Frame instance = new Frame();
        instance.setButon(buton);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getCalculator method, of class Frame.
     */
    @Test
    public void testGetCalculator() {
        System.out.println("getCalculator");
        Frame instance = new Frame();
        Calculator expResult = null;
        Calculator result = instance.getCalculator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setCalculator method, of class Frame.
     */
    @Test
    public void testSetCalculator() {
        System.out.println("setCalculator");
        Calculator calculator = null;
        Frame instance = new Frame();
        instance.setCalculator(calculator);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
