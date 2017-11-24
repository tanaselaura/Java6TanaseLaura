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
public class CalculatorTest {
    
    public CalculatorTest() {
    }

    /**
     * Test of getNumber1 method, of class Calculator.
     */
    @Test
    public void testGetNumber1() {
        System.out.println("getNumber1");
        Calculator instance = new Calculator();
        Double expResult = 4.00;
        instance.setNumber1(4.00);
        Double result = instance.getNumber1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber1 method, of class Calculator.
     */
    @Test
    public void testSetNumber1() {
        System.out.println("setNumber1");
        Double newNumber1 = 4.00;
        Calculator instance = new Calculator();
        instance.setNumber1(newNumber1);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumber2 method, of class Calculator.
     */
    @Test
    public void testGetNumber2() {
        System.out.println("getNumber2");
        Calculator instance = new Calculator();
        Double expResult = 6.00;
        instance.setNumber2(6.00);
        Double result = instance.getNumber2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumber2 method, of class Calculator.
     */
    @Test
    public void testSetNumber2() {
        System.out.println("setNumber2");
        Double newNumber2 = 6.00;
        Calculator instance = new Calculator();
        instance.setNumber2(newNumber2);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getOperator method, of class Calculator.
     */
    @Test
    public void testGetOperator() {
        System.out.println("getOperator");
        Calculator instance = new Calculator();
        Character expResult = '+';
        instance.setOperator('+');
        Character result = instance.getOperator();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setOperator method, of class Calculator.
     */
    @Test
    public void testSetOperator() {
        System.out.println("setOperator");
        Character newOperator = '+';
        Calculator instance = new Calculator();
        instance.setOperator(newOperator);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
/**
     * Test of calculateTotal method, of class Calculator.
     */
    @Test
    public void testCalculateTotal() {
        System.out.println("calculateTotal");
        Calculator instance = new Calculator();
        Double expResult = 10.00;
        instance.setNumber1(4.00);
        instance.setNumber2(6.00);
        instance.setOperator('+');
        Double result = instance.calculateTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    
}
