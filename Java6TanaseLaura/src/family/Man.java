/*
 * Man character
 */
package family;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laurici
 */
public class Man extends Thread{
    private Woman w;
    private VacuumCleaner vc;
    private TV  tv;
     private Cigar tigara;
    
    /**
     *
     * @param v
     * @param woman
     * @param televizor
     */
    public Man (VacuumCleaner v, Woman woman, TV televizor){
        v = vc;
        woman = w;
        tv = televizor;
        
    }

    /**
     *
     */
    @Override
    public void run(){
        TV televizor = new TV();
         Cigar c = new Cigar();
        Woman woman = new Woman(c, televizor);
        //favorite show appears
        televizor.ruleazaEmisiuneaNeplictisitoare();
        try {
            sleep(100);
        } catch (InterruptedException ex) {
            Logger.getLogger(Man.class.getName()).log(Level.SEVERE, null, ex);
        }
        //man wakes up woman
        watchinTV(televizor, woman);
     
      
        
        
    }
    private void cleaning(VacuumCleaner vc ){
        vc.setIscleaning(Boolean.TRUE);
        
    }
    private void watchinTV(TV tv, Woman w){
     
       if (tv.isFavoriteShow == true ){

                 w.setIsSleaping(false);
                 System.out.println("Wake up woman... your show started!!!!");
                
        }
           
        }
}
