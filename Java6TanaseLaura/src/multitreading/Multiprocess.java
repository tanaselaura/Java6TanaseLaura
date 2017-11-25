/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multitreading;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laurici
 */
public class Multiprocess {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try {
        // TODO code application logic heretry {
        ProcessBuilder pb;
        // Use process builder to start 2 processes multithreading.SayHello with parameter
        pb= new ProcessBuilder(
          "java",
          "-classpath",
         "C:\\Users\\Laurici\\Documents\\NetBeansProjects\\SalutLume\\build\\classes\\multitreading",
         "multithreading.SayHello",
         "2", "John", "Jane");
 Map<String, String> env = pb.environment();
 env.put("TEXT_CONGRATS", "Congratulations for starting your process! ");
 env.remove("OTHERVAR");
 env.put("TEXT_HI", "Hello ");
 pb.directory(new File("C:\\Users\\Laurici\\Documents\\NetBeansProjects\\SalutLume\\build\\classes\\multitreading")
);
 Process p1 = pb.start();
 Process p2 = pb.start();
 } 
 catch (IOException ex) {
 Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
 }
    }
  }
    

