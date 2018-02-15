/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.contrib.java.lang.system.TextFromStandardInputStream;

/**
 *
 * @author Laurici
 * This test needs system-rules library to work
 */
public class FrameTest {
    
    @Rule
    public final TextFromStandardInputStream systemInMock = TextFromStandardInputStream.emptyStandardInputStream();
     @Rule
    public final SystemOutRule systemOutMock = new SystemOutRule().enableLog();
    public static Frame frame;
    
    @BeforeClass
    public static void setUp() {
        frame = new Frame();
    }

    @AfterClass
    public static void restoreStreams() {
        System.setIn(System.in);
        System.setOut(System.out);
        System.setErr(System.err);
    }
    
    /**
     * Test of start method, of class Frame.
     */
    @Test
    public void testStart() {
        System.out.println("start");
        frame.start();
        Integer expectedResult = 0;
        Integer valAfisat = Integer.parseInt(frame.getEcran().getScreenMemory());
        assertEquals(expectedResult, valAfisat);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of afiseazaOperand method, of class Frame.
     */
    @Test
    public void testAfiseazaOperand() {
   
        systemInMock.provideLines("4", "5");
        frame.afiseazaOperand();
        assertEquals(new Double("4.0"), frame.getCalculator().getNumber1());
        frame.afiseazaOperand();
        assertEquals(new Double("4.0"), frame.getCalculator().getNumber1());
        assertEquals(new Double("5.0"), frame.getCalculator().getNumber2());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of afiseazaOoperator method, of class Frame.
     */
    @Test
    public void testAfiseazaOperator() {
        System.out.println("afiseazaOoperator");
        systemInMock.provideLines("+");
        Character expectResult = '+';
        frame.afiseazaOperator();
        assertEquals(expectResult, frame.getCalculator().getOperator());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }


    /**
     * Test of afiseazaRezultat method, of class Frame.
     */
    @Test
    public void testAfiseazaRezultat() {
        frame.afiseazaRezultat();
        assertEquals("Display: 9.0" + System.getProperty("line.separator"), systemOutMock.getLog());
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

  
    /**
     * Test of getButon method, of class Frame.
     */
    @Test
    public void testGetButon() {
        System.out.println("getButon");
        Button[] expResult = new Button[0];
        frame.setButon(new Button[0]);
        Button[] result = frame.getButon();
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
        Button[] buton = new Button[0];
        frame.setButon(buton);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

   
    
}
