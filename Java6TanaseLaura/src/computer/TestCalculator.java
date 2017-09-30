package computer;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Class test TestCalculator tests Calculator
 *
 * @author Laurici
 */
public class TestCalculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // create a Calculator instance
        Calculator computer = new Calculator();

        computer.start();

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Please introduce your first number:");
        computer.number1 = reader.nextInt();

        System.out.println("Please introduce operator(+/-/*//)");
        String c = reader.next();

        System.out.println("Please introduce second number");
        computer.number2 = reader.nextInt();

        System.out.println("Please introduce = ");
        char d = reader.next().charAt(0);
        if (d == '=') {
            //start the calculator

            switch (c) {
                case "+":
                    //test the add 123+223
                    computer.add();
                    break;
                case "-":
                    //test 223-112
                    computer.decrease();
                    break;
                case "*":
                    // test 123*12
                    computer.multiply();
                    break;
                case "/":
                    //test 24:6
                    computer.divide();
                    break;
                default:
                    System.out.print("Sorry, you introduced wrong data. I quit :)");
                    break;
            }

        } else {
            System.out.print("Sorry, you introduced wrong data. I quit :)");

        }

    }

}
