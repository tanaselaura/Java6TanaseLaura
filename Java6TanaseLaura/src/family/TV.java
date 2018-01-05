/*
 * TV
 */
package family;

/**
 *
 * @author Laurici
 */
public class TV {
   public volatile boolean isFavoriteShow = true;

    //tv shows boring shows
     public synchronized void ruleazaEmisiuneaPlictisitoare() {
         System.out.println("Tv shows are boring...");
        isFavoriteShow = false;
        }
     
    // Tv shows favorite show 
    public synchronized void ruleazaEmisiuneaNeplictisitoare() {
         System.out.println("Tv show started!!!");
        isFavoriteShow = true;
    }
}
