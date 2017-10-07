/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computer;

import java.util.Scanner;

/**
 *
 * @author Laurici
 */
public class Frame {
    private Screen ecran;
    private Button[] buton;
    private Character markupsOfButtons[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '+', '*', '/' };
    private Calculator calculator;
    
         public Frame() {
         ecran = new Screen();
         calculator = new Calculator();
         buton =  new Button[15];
         int i = 0;
         for(Character currentMarkup:markupsOfButtons){
             Button newButton = new Button();
             newButton.drawOnButton(currentMarkup);
             buton[i] = newButton;
             i++;
         }
     }
    
    public void start() {
         ecran.display("0");
     }
    
    public void displayMessageOnScreen(String message){
        ecran.displayMessage(message);
        
    }
    
    public void afiseazaOperand(){
         Scanner scan = new Scanner(System.in);
         String readit = scan.nextLine();
         Double val = Double.valueOf(readit);
         ecran.display(readit);
         if(calculator.getNumber1() == null)
             calculator.setNumber1(val);
         else
             calculator.setNumber2(val);
    }
    
    
    public void afiseazaOoperator(){
        Scanner scan = new Scanner(System.in);
        String readit = scan.nextLine();
        Character val = readit.charAt(0);
        System.out.println("You introduced operand: " + val );
        calculator.setOperator(val);
        
    }
    

    public void afiseazaequal() {
         Scanner scan = new Scanner(System.in);
        Character val = scan.next().charAt(0);
      
    
    }
    public void afiseazaRezultat(){
       
        ecran.display(calculator.calculateTotal().toString() );
        
    }
    

        
    
    
}
