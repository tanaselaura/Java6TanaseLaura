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
public class Square extends Figure {
    private static final String DEFINITION = "SQUARE: with four equal straight sides and four right angles. ";

    /**
     *
     * @return
     */
    @Override
    public String getDefiniton(){
        String figureDefinition = super.getDefiniton();
        StringBuilder squareDefinition = new StringBuilder("");
        squareDefinition.append(DEFINITION);
        squareDefinition.insert(8, figureDefinition);
        return squareDefinition.toString();
   }
    
}
