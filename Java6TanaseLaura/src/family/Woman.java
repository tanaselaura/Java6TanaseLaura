/*
 * Woman character
 */
package family;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laurici
 */
public class Woman extends Thread{
    boolean isSleaping = true;
    private Cigar tigara;
    private TV tv;
    //constructor
    public Woman (Cigar c, TV televizor){
        tv = televizor;
        c = tigara; 
    }
    // getters and setters
    public boolean getIsSleeping(){
        return isSleaping;
    }
    
    public void setIsSleaping(boolean isSleaping) {
        this.isSleaping = isSleaping;    
    }
    //woman sleeps
     private void womanIsSleeping(TV tv){
         if (tv.isFavoriteShow == false){
             isSleaping = true;
             System.out.println("Woman is sleaping... and snoring");
         }

     }

    
    @Override
    public void run(){
        //punem comportamentul femeii
        TV televizor = new TV();
        //TV shows are boring
        televizor.ruleazaEmisiuneaPlictisitoare();
        //woman sleeps while Tv not shows are boring
        womanIsSleeping(televizor);
        //wait a while until favorite show appears
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Woman.class.getName()).log(Level.SEVERE, null, ex);
        }
        //woman wakes up when TV is showing favoritw show
        if (tv.isFavoriteShow == true){
                 System.out.println("Woman is looking at TV");
                 isSleaping = false;
               
            }
    }
}
