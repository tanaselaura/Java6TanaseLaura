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
   private Double number1;
   private Double number2;
   private Double total;
   private Character operator;

    
    
    private Screen ecran;
    
    public Double getNumber1(){
        return(number1);
    }
    public void setNumber1(Double newNumber1){
        number1 = newNumber1;
    }
    
     public Double getNumber2(){
        return(number2);
    }
    public void setNumber2(Double newNumber2){
        number2 = newNumber2;
    }
    
     public Character getOperator(){
        return(operator);
    }
    public void setOperator(Character newOperator){
        operator = newOperator;
    }
    
    
    public Calculator() {
        ecran = new Screen();
       
    }
    /**
     * Methods adds 2 digits introduced by user from keyboard
     */

    private Double add() {
        total = number1 + number2;
        return total;
        
    }
    /**
     * Methods substracts 2 digits introduced by the user
     */
    private Double decrease() {
        total = number1 - number2;
        return total;
       
    }
    /**
     * Multiply 2 numbers introduced by the user
     */
     private Double multiply() {
         total = number1 * number2;
        return total;
         
     }
   
     /**
      * Divided 2 numbers introduced by the user
      */
     private Double divide() {
         total = number1 / number2;
        return total;
         
     }
     /**
      * Methods substracts 2 digits introduced by the user
     * @return 
      */
     
     public Double calculateTotal(){
         switch (operator){
             case '+' :
                 add();
                 break;
             case '-' :
                 decrease();
                 break;
             case '*' :
                 multiply();
                 break;
             case '/' :
                 divide();
                 break;
               
         }
         return total;
     }
     
     
     

}




