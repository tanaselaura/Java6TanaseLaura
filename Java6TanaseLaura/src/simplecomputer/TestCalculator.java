/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simplecomputer;

import java.util.Scanner;

/**
 *
 * @author Laurici
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1;
        double num2;
        double total;
        
        System.out.println( "Please introduce your first number:");
        Scanner reader = new Scanner(System.in);
        num1 = reader.nextDouble();

        System.out.println("Please introduce operator(+/-/*//)");
        char c = reader.next().charAt(0);
       
        
         System.out.println( "Please introduce your second number:");
        num2 = reader.nextDouble();
        
        System.out.println( " Please introduce \"=\"");
        char equal = reader.next().charAt(0);
        
        if (equal == '='){
            switch (c) {
                case '+':
                    total = num1 + num2;
                    System.out.println("Result is: " + total);
                    break;
                case '-':
                    total = num1 - num2;
                    System.out.println("Result is: " + total);
                    break;
                case '/':
                    total = num1 / num2;
                    System.out.println("Result is: " + total);
                    break;
                case '*':
                    total = num1 * num2;
                    System.out.println("Result is: " + total);
                    break;
                default:
                    System.out.println( "Sorry, you introduced wrong data. I quit :)");
                    
                
            }
        } else {
             System.out.println( "Sorry, you introduced wrong data. I quit :)");
        }
      
        
        
    }
    
}
