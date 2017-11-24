/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package definitions;

/**
 *
 * @author Laurici
 */
public class Rectangle extends Figure {
    private static final String DEFINITION = "RECTANGLE: with four straight sides and four right angles,\n" +
"especially one with unequal adjacent sides, in contrast to a square.";

    /**
     *
     * @return
     */
    @Override
    public String getDefiniton(){
        String figureDefinition = super.getDefiniton();
        StringBuilder rectangleDefinition = new StringBuilder("");
        rectangleDefinition.append(DEFINITION);
        rectangleDefinition.insert(11, figureDefinition);
        return rectangleDefinition.toString();
   }
    
}