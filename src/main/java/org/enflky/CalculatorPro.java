package org.enflky;

import java.util.Scanner;
import static org.enflky.CalcStuff.*;

public class CalculatorPro {    
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.println("Basic Calculator: 1");
        System.out.println("Root calculator: 2");
        System.out.println("Factorial Calculator: 3");
        System.out.println("Double & Even Cheker: 4");
        System.out.print("Please select your mode and type that mode code: ");
        boolean calcIsModeSelected=false;
        while(!(calcIsModeSelected)){
            switch (type.next()) {
                case "1":
                    BasicCalculator();
                    calcIsModeSelected = true;
                    break;
                case "2" :
                    RootCalculator();
                    calcIsModeSelected = true;
                    break;
                case "3":
                    FactorialCalculator();
                    calcIsModeSelected = true;
                    break;
                case "4":
                    OddEvenCalculator();
                    calcIsModeSelected = true;
                    break;
                default:
                    System.out.println("Invalid input, Please enter a Valid Code...");
                    type.nextLine();
                    break;
            }
        }
    }
}
