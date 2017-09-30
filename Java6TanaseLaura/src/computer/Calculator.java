/*
 * 
 * Computer frame
 * 
 */
package computer;

import java.util.Scanner;

/**
 *Calculator frame
 * @author Laurici
 */
public class Calculator {
    double number1;
    double number2;
    double total;

    
    
    private Screen ecran;
    public Calculator() {
        ecran = new Screen();
       
    }
    /**
     * Methods adds 2 digits introduced by user from keyboard
     */

    public void add() {
        total = number1 + number2;
        System.out.println("Result is: " + total);
        
    }
    /**
     * Methods substracts 2 digits introduced by the user
     */
    public void decrease() {
        total = number1 - number2;
        System.out.println("Result is: " + total);
       
    }
    /**
     * Multiply 2 numbers introduced by the user
     */
     public void multiply() {
         total = number1 * number2;
        System.out.println("Result is: " + total);
         
     }
     /**
      * Divided 2 numbers introduced by the user
      */
     public void divide() {
         total = number1 / number2;
        System.out.println("Result is: " + total);
         
     }
     /**
      * Methods substracts 2 digits introduced by the user
      */
     public void start() {
         ecran.display("0");
     }
     

}




