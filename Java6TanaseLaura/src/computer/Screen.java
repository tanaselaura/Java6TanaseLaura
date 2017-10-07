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
             valueToDisplay = valueToDisplay.replace(".xml", "");
             screenMemory = valueToDisplay;
              System.out.println("Display: " + screenMemory);
             
              
         }

         public void clear(){
             System.out.println(0);
             screenMemory = "0";
         }
 

     public String getValoareAfisata() {
         return screenMemory;
     }
 
 
     public void setValoareAfisata(String valoareAfisata) {
         this.screenMemory = valoareAfisata;
     }
 
     public void displayMessage(String message){
         System.out.println(message);
         
     }
      
     
     
  }