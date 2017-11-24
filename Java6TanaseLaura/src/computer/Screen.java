 /*
  * Screen of computer
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
   */
  package computer;
  
  /**
 *
 * @author Laurici
 */
  public class Screen {
      
     private String screenMemory = "0";

    

         public void display(String valueToDisplay){
             screenMemory = valueToDisplay;
              System.out.println("Display: " + screenMemory);
             
              
         }


 
     public void displayMessage(String message){
         System.out.println(message);
         
     }
      
       public String getScreenMemory() {
        return screenMemory;
    }

    public void setScreenMemory(String screenMemory) {
        this.screenMemory = screenMemory;
    }
       
     
  }