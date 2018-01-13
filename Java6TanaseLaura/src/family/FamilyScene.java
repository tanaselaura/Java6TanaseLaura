/*
 * Family scene
 */
package family;

/**
 *
 * @author Laurici
 */
public class FamilyScene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              // create instances of all actors
        Cigar tigara = new Cigar();
         TV televizor = new TV();
        Woman femeie = new Woman(tigara,televizor);
        VacuumCleaner aspirator = new VacuumCleaner();
        Man barbat = new Man(aspirator, femeie, televizor);
        //start the threads
        
        tigara.start();
        //televizor.start();
        aspirator.start();
        barbat.start();
        femeie.start();
        //set priorities
        barbat.setPriority(1);
        
    }
}
