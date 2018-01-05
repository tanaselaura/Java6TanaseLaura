/*
 * VacuumCleaner
 */
package family;

import static java.lang.Thread.MIN_PRIORITY;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laurici
 */
public class VacuumCleaner extends Thread {
    private boolean isCleaning = false;
    
    @Override
    public void run(){
        System.out.println("VacuumCleaner is cleaning");
        cleaning();
        
        
    }
    private void cleaning(){
        if (isCleaning == true)
            try {
                Thread.sleep(MIN_PRIORITY);
        } catch (InterruptedException ex) {
            Logger.getLogger(VacuumCleaner.class.getName()).log(Level.SEVERE, null, ex); // unde e null punem mesaj
        }
        
    }

    public boolean isIscleaning() {
        return isCleaning;
    }

    public void setIscleaning(boolean iscleaning) {
        this.isCleaning = iscleaning;
    }
}
