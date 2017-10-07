package computer;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Class test TestCalculator tests Calculator
 *
 * @author Laurici
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Frame frame = new Frame();
        
        frame.start();
        // Open calculator
        frame.displayMessageOnScreen("Please introduce your first operand: ");
        frame.afiseazaOperand();
        //Read first operator
        frame.displayMessageOnScreen("Please introduce your first operator: ");
        frame.afiseazaOoperator();
        //Read method
        frame.displayMessageOnScreen("Please introduce your second operand: ");
        frame.afiseazaOperand();
        //Read second operator
        frame.displayMessageOnScreen("Please introduce equal: ");
        frame.afiseazaequal();
        //press equal
        frame.afiseazaRezultat();
        //afiseaza rezultat
       
        
    }
}