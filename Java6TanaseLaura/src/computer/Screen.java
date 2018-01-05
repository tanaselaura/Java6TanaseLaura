 /*
  * Computer Screed
   */
  package computer;
  
  /**
 *
 * @author Laurici
 */
  public class Screen {
      
     private String screenMemory = "0";

    
     /**
     * Methods display messages the screen shows
     */
         public void display(String valueToDisplay){
             screenMemory = valueToDisplay;
              System.out.println("Display: " + screenMemory);
             
              
         }


    /**
     * Methods display messages that helps user to use the calculator
     */
     public void displayMessage(String message){
         System.out.println(message);
         
     }
    // getters abd setters 
       public String getScreenMemory() {
        return screenMemory;
    }
    
    public void setScreenMemory(String screenMemory) {
        this.screenMemory = screenMemory;
    }
       
     
  }