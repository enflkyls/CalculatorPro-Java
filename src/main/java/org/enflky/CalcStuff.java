package org.enflky;

import javax.swing.*;
import java.math.BigInteger;
import java.util.Scanner;

public class CalcStuff {
    public static double numberfind(String question,Scanner input){
        //dont repeat yourself method
        System.out.print(question);
        double number;
        while (true) {
            if (!input.hasNextDouble()) {
                System.out.println("Invalid input, Please enter a Valid Number...");
                System.out.print(question);
                input.nextLine();
            }
            else {
                number = input.nextDouble();
                break;
            }
        }
        return number;
    }

    public static void BasicCalculator(){
        Scanner bcalc_Input = new Scanner(System.in);
        int bcalcFirst_InputNumber = (int) numberfind("Enter First Number: ",bcalc_Input);
        System.out.print("Please enter a Operator: ");
        boolean bcalcIsOperatorCorrect = false;
        char bcalcOperator = 0;
        while (!(bcalcIsOperatorCorrect)) {
            switch (bcalc_Input.next().charAt(0)) {
                case '+':
                    bcalcOperator = '+';
                    bcalcIsOperatorCorrect = true;
                    break;
                case '-':
                    bcalcOperator = '-';
                    bcalcIsOperatorCorrect = true;
                    break;
                case '*':
                    bcalcOperator = '*';
                    bcalcIsOperatorCorrect = true;
                    break;
                case '/':
                    bcalcOperator = '/';
                    bcalcIsOperatorCorrect = true;
                    break;
                case '^':
                    bcalcOperator = '^';
                    bcalcIsOperatorCorrect = true;
                    break;
                default:
                    System.out.println("Invalid input, you can only input these oparetors '+,-,*,/,^'");
                    System.out.print("Please enter a Operator: ");
                    bcalc_Input.nextLine();
            }
        }
        int bcalcSecond_InputNumber = (int) numberfind("Enter Second Number: ",bcalc_Input);
        bcalc_Input.close();
        boolean bcalcCanOutputAnswer = true;
        if (bcalcOperator == '/' && bcalcSecond_InputNumber == 0) {
            bcalcCanOutputAnswer = false;
            System.out.print("You cant divide by zero... ");
        }
        int bcalcOutputAnswer = 0;
        switch(bcalcOperator) {
            case '+' -> bcalcOutputAnswer = bcalcFirst_InputNumber + bcalcSecond_InputNumber;
            case '-' -> bcalcOutputAnswer = bcalcFirst_InputNumber - bcalcSecond_InputNumber;
            case '*' -> bcalcOutputAnswer = bcalcFirst_InputNumber * bcalcSecond_InputNumber;
            case '/' -> bcalcOutputAnswer = (int) bcalcFirst_InputNumber / bcalcSecond_InputNumber;
            case '^' -> bcalcOutputAnswer = (int) Math.pow(bcalcFirst_InputNumber, bcalcSecond_InputNumber);
            default -> bcalcCanOutputAnswer = false;
        }
        if (bcalcCanOutputAnswer) {
            System.out.print(bcalcFirst_InputNumber +" "+ bcalcOperator +" "+ bcalcSecond_InputNumber +" = "+ bcalcOutputAnswer);
            System.out.println(" Answer is : "+ bcalcOutputAnswer);
        }
        else {
            //this error should not posible to get it..  or is it?
            System.out.println("Calculating.Error.Unexpected");
        }
    }
    //dont repeat yourself isnt working here i can make it work but im lazy maybe in future
    public static void AdvancedCalculator(){
        Scanner bcalc_Input = new Scanner(System.in);
        double bcalcFirst_InputNumber = numberfind("Enter First Number: ",bcalc_Input);
        System.out.print("Please enter a Operator: ");
        boolean bcalcIsOperatorCorrect = false;
        char bcalcOperator = 0;
        while (!(bcalcIsOperatorCorrect)) {
            switch (bcalc_Input.next().charAt(0)) {
                case '+':
                    bcalcOperator = '+';
                    bcalcIsOperatorCorrect = true;
                    break;
                case '-':
                    bcalcOperator = '-';
                    bcalcIsOperatorCorrect = true;
                    break;
                case '*':
                    bcalcOperator = '*';
                    bcalcIsOperatorCorrect = true;
                    break;
                case '/':
                    bcalcOperator = '/';
                    bcalcIsOperatorCorrect = true;
                    break;
                case '^':
                    bcalcOperator = '^';
                    bcalcIsOperatorCorrect = true;
                    break;
                default:
                    System.out.println("Invalid input, you can only input these oparetors '+,-,*,/,^'");
                    System.out.print("Please enter a Operator: ");
                    bcalc_Input.nextLine();
            }
        }
        double bcalcSecond_InputNumber = numberfind("Enter Second Number: ",bcalc_Input);
        bcalc_Input.close();
        boolean bcalcCanOutputAnswer = true;
        if (bcalcOperator == '/' && bcalcSecond_InputNumber == 0) {
            bcalcCanOutputAnswer = false;
            System.out.print("You cant divide by zero... ");
        }
        double bcalcOutputAnswer = 0;
        switch(bcalcOperator) {
            case '+' -> bcalcOutputAnswer = bcalcFirst_InputNumber + bcalcSecond_InputNumber;
            case '-' -> bcalcOutputAnswer = bcalcFirst_InputNumber - bcalcSecond_InputNumber;
            case '*' -> bcalcOutputAnswer = bcalcFirst_InputNumber * bcalcSecond_InputNumber;
            case '/' -> bcalcOutputAnswer = bcalcFirst_InputNumber / bcalcSecond_InputNumber;
            case '^' -> bcalcOutputAnswer =  Math.pow(bcalcFirst_InputNumber, bcalcSecond_InputNumber);
            default -> bcalcCanOutputAnswer = false;
        }
        if (bcalcCanOutputAnswer) {
            System.out.print(bcalcFirst_InputNumber +" "+ bcalcOperator +" "+ bcalcSecond_InputNumber +" = "+ bcalcOutputAnswer);
            System.out.println(" Answer is : "+ bcalcOutputAnswer);
        }
        else {
            //this error should not posible to get it..  or is it?
            System.out.println("Calculating.Error.Unexpected");
        }
    }

    public static void RootCalculator(){
        Scanner rcalc_Input = new Scanner(System.in);
        double rcalcOutputAnswer;
        System.out.print("Enter the Number to find its square root: ");
        double rcalc_InputNumber = numberfind("Enter the Number to find its square root: ",rcalc_Input);
        rcalcOutputAnswer = Math.sqrt(rcalc_InputNumber);
        rcalc_Input.close();
        System.out.println("Square root of "+ rcalc_InputNumber+" is "+rcalcOutputAnswer);
    }
    public static void FactorialCalculator(){
        //new way to calculate Factorials hehe
        Scanner fcalc_Input = new Scanner(System.in);
        BigInteger fcalc_OutputAnswer = new BigInteger("1");
        int fcalc_PreInputNumber = (int) numberfind("Enter the Number to find its factorial: ", fcalc_Input);
        BigInteger fcalc_InputNumber = BigInteger.valueOf(fcalc_PreInputNumber);
        fcalc_OutputAnswer = Factorial(fcalc_InputNumber);
        System.out.println("Factorial of "+ fcalc_InputNumber+" is "+ fcalc_OutputAnswer);
    }
    public static BigInteger Factorial(BigInteger n){
        //A LOT of MESS but it works :D
        if  ((n.subtract(BigInteger.valueOf(1))).equals(BigInteger.valueOf(0)) || n.equals(BigInteger.valueOf(0))){ return new BigInteger("1");}
        else {return n.multiply(Factorial(n.subtract(BigInteger.valueOf(1))));}
    }

    public static void OddEvenCalculator(){
        Scanner oecalc_Input = new Scanner(System.in);
        System.out.print("Enter the Number to find its a odd or a even number: ");
        int oecalc_InputNumber = (int) numberfind("Enter the Number to find its a odd or a even number: ",oecalc_Input);
        if  (oecalc_InputNumber % 2 == 0) {
            System.out.print(oecalc_InputNumber + " is a even number");
        }
        else  {
            System.out.print(oecalc_InputNumber + " is a odd number");
        }
    }
    public static void PatternCalculator(){
        Scanner pcalc_Input = new Scanner(System.in);
        int pcalcStartInput;
        long pcalcEndInput;
        int pcalcIncraseValue;

        System.out.print("Enter the number you want start pattern from: ");
        while (true) {
            if (!pcalc_Input.hasNextInt()) {
                System.out.println("Invalid input, Please enter a Valid Number...");
                System.out.print("Enter the number you want start pattern from: ");
            }
            else {
                pcalcStartInput = pcalc_Input.nextInt();
                break;
            }
        }
        System.out.print("Enter the number a number that pattern ends: ");
        while (true) {
            if (!pcalc_Input.hasNextLong()) {
                System.out.println("Invalid input, Please enter a Valid Number...");
                System.out.print("Enter the number a number that pattern ends: ");
            }
            else  {
                pcalcEndInput = pcalc_Input.nextLong();
                break;
            }
        }
        System.out.print("Enter the number you want pattern to incrase: ");
        while (true) {
            if (!pcalc_Input.hasNextInt()) {
                System.out.println("Invalid input, Please enter a Valid Number...");
                System.out.print("Enter the number you want pattern to incrase: ");
            }
            else {
                pcalcIncraseValue = pcalc_Input.nextInt();
                break;
            }
        }
        System.out.print("Pattern starts from "+pcalcStartInput+" and ends at "+pcalcEndInput+" and incrase by "+pcalcIncraseValue);
        pcalc_Input.close();
        for (int i = pcalcStartInput;i<=pcalcEndInput;i += pcalcIncraseValue) {
            System.out.print(i);
        }

    }
}
