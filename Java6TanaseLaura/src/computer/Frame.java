/*
 *Computer frame
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
    private final Character markupsOfButtons[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '-', '+', '*', '/' };
    
    private Calculator calculator;
         //constructor
         public Frame() {
         ecran = new Screen();
         calculator = new Calculator();
         buton =  new Button[15];
         int i = 0;
         //draw characters on buttons
         for(Character currentMarkup:markupsOfButtons){
             Button newButton = new Button();
             newButton.drawOnButton(currentMarkup);
             buton[i] = newButton;
             i++;
         }
     }
         
    /**
     * Methods starts the calculator
     */
    public void start() {
         ecran.display("0");
     }
    /**
     * Methods displays message on screen
     */
    public void displayMessageOnScreen(String message){
        ecran.displayMessage(message);
        
    }
    /**
     * Methods reads from keyboard first and second number
     */
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
    
    /**
     * Methods reads from keyboard operator
     */
    public void afiseazaOperator(){
        Scanner scan = new Scanner(System.in);
        String readit = scan.nextLine();
        Character val = readit.charAt(0);
        System.out.println("You introduced operand: " + val );
        calculator.setOperator(val);  
    }
    
    /**
     * Methods reads from keyboard =
     */
    public void afiseazaEqual() {
        Scanner scan = new Scanner(System.in);
        Character val = scan.next().charAt(0);
    }
    
    public void afiseazaRezultat(){
        ecran.display(calculator.calculateTotal().toString() );
        
    }
    //getters and setters
    public Screen getEcran() {
        return ecran;
    }

    public void setEcran(Screen ecran) {
        this.ecran = ecran;
    }

    public Button[] getButon() {
        return buton;
    }

    public void setButon(Button[] buton) {
        this.buton = buton;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }
  
}
