package org.enflky;

import java.util.Scanner;
import static org.enflky.CalcStuff.*;

public class CalculatorPro {    
    public static void main(String[] args) {
        Scanner type = new Scanner(System.in);
        System.out.println("-------------------------------------------");
        System.out.println("Integer/Rational Calculator: 1");
        System.out.println("Root calculator: 2");
        System.out.println("Factorial Calculator: 3");
        System.out.println("Double & Even Cheker: 4");
        System.out.println("Pattern Calculator: 5 Broken");
        System.out.println("-------------------------------------------");
        System.out.print("Please select your mode and type that mode code: ");
        boolean calcIsModeSelected=false;
        while(!(calcIsModeSelected)){
            switch (type.next()) {
                case "1":
                    System.out.print(" Integer:1\n Rational:2\n Whats is Your choice: ");
                    int choice;
                    while (true) {
                        if (!type.hasNextInt()) {
                            System.out.println("Please enter A correct choice.");
                            System.out.print(" Integer:1\nRational:2\nWhats is Your choice: ");
                            type.nextLine();
                        }
                        else {
                            choice = type.nextInt();
                            break;
                        }
                    }
                    if (choice == 1) {
                        BasicCalculator();
                    }else {AdvancedCalculator();}
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
                case "5":
                    PatternCalculator();
                    calcIsModeSelected = true;
                    break;
                default:
                    System.out.println("Invalid input, Please enter a Valid Code...");
                    System.out.println("-------------------------------------------");
                    System.out.println("Integer/Rational Calculator: 1");
                    System.out.println("Root calculator: 2");
                    System.out.println("Factorial Calculator: 3");
                    System.out.println("Double & Even Cheker: 4");
                    System.out.println("Pattern Calculator: 5 Broken");
                    System.out.println("-------------------------------------------");
                    System.out.print("Please select your mode and type that mode code: ");
                    type.nextLine();
            }
        }
    }
}
