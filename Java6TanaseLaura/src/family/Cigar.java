/*
 * Cigar
 */
package family;

/**
 *
 * @author Laurici
 */
public class Cigar extends Thread {
    @Override
    public void run(){
        burning();
        
    }
    //Cigar burning
    private void burning (){
        System.out.println("Arde tigara!");
        
    }
    
}

