package multitreading;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


/*
 * Class launches three processes of notepad.exe
 */

/**
 *
 * @author Laurici
 */
public class LounchNotepads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
             // TODO code application logic heretry {
              ProcessBuilder pb;
            // Use process builder to start 2 processes multithreading.SayHello with parameter
            pb= new ProcessBuilder( "notepad");
            pb.directory(new File("C:\\Users\\Laurici\\Desktop") );
             Process p1 = pb.start();
             Process p2 = pb.start();
             Process p3 = pb.start();
            } 

 
 
 catch (IOException ex) {
 Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
 }
    }
  }
        // TODO code application logic here
  