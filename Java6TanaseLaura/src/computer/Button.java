/*
 * Button
 */
package computer;

/**
 *
 * @author Laurici
 */
public class Button {
    
    private Character markup;

    public Character pushButton(){
        return markup;
    }
    
    public void drawOnButton(Character markup){
        this.markup = markup;
    }
    
}
