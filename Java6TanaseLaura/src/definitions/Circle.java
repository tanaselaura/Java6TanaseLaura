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
public class Circle extends Figure {
    private static final String DEFINITION = "CIRCLE: whose boundary (the circumference) consists of\n" +
"points equidistant from a fixed point (the centre). ";

    /**
     *
     * @return
     */
    @Override
    public String getDefiniton(){
        String figureDefinition = super.getDefiniton();
        StringBuilder circleDefinition = new StringBuilder("");
        circleDefinition.append(DEFINITION);
        circleDefinition.insert(8, figureDefinition);
        return circleDefinition.toString();
   }
    
}
