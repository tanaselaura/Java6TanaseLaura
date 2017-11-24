/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package definitions;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Laurici
 */
public class TestDefiniton {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Create a list of figures
        List<Figure> figures = new ArrayList<>();
        // add circle, rectangle, square and triangle to the list
        figures.add(new Circle());
        figures.add(new Rectangle());
        figures.add(new Square());
        figures.add(new Triangle());
        // test if i have 4 
        System.out.println("Figures are" + figures.size() );
        // print out all the elements of the list
        for (Figure elem: figures){
            System.out.println(elem.getDefiniton());
        }
   
       

    }
    
}

