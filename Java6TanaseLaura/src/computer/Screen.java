/*
 * Screen of computer
 */
package computer;

import java.util.Scanner;

/**
 *Class Screen implements behavior of screen
 * @author Laurici
 */
public class Screen {
    String screenMemory =  "Display: ";
    public void display(String deAfisat){
        screenMemory += deAfisat;
        System.out.println(screenMemory);
        
      
    }
    
}
