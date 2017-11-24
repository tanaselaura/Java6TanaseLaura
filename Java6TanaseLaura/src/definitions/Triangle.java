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
public class Triangle extends Figure {
    private static final String DEFINITION = "TRIANGLE: with three straight sides and three angles. ";

    /**
     *
     * @return
     */
    @Override
    public String getDefiniton(){
        String figureDefinition = super.getDefiniton();
        StringBuilder triangleDefinition = new StringBuilder("");
        triangleDefinition.append(DEFINITION);
        triangleDefinition.insert(10, figureDefinition);
        return triangleDefinition.toString();
   }
    
}
