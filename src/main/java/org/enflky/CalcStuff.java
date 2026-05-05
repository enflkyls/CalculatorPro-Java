package org.enflky;

import java.math.BigInteger;
import java.util.Scanner;

public class CalcStuff {
    public static void BasicCalculator(){
        Scanner bcalc_Input = new Scanner(System.in);
        double bcalcFirst_InputNumber;
        double bcalcSecond_InputNumber;
        double bcalcOutputAnswer = 0;
        char bcalcOperator = 0;
        boolean bcalcCanOutputAnswer = true;
        boolean bcalcIsOperatorCorrect = false;
        System.out.print("Enter First Number: ");
        while (true) {
            if (!bcalc_Input.hasNextDouble()) {
                System.out.println("Invalid input, Please enter a Valid Number...");
                System.out.print("Enter First Number: ");
                bcalc_Input.nextLine();
            }
            else {
                bcalcFirst_InputNumber = bcalc_Input.nextDouble();
                System.out.print("Please enter a Operator: ");
                break;
            }
        }
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
        System.out.print("Enter Second Number: ");
        while (true) {
            if (!bcalc_Input.hasNextDouble()) {
                System.out.println("Invalid input, Please enter a Valid Number...");
                System.out.print("Enter Second Number: ");
                bcalc_Input.nextLine();
            }
            else  {
                bcalcSecond_InputNumber = bcalc_Input.nextDouble();
                break;
            }
        }
        bcalc_Input.close();
        if (bcalcOperator == '/' && bcalcSecond_InputNumber == 0) {
            bcalcCanOutputAnswer = false;
            System.out.print("You cant divide by zero... ");
        }
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
            System.out.println("Calculating.Error.Unexpected");
        }
    }

    public static void RootCalculator(){
        Scanner rcalc_Input = new Scanner(System.in);
        double rcalc_InputNumber;
        double rcalcOutputAnswer;
        boolean rcalcCanOutputAnswer = true;
        System.out.print("Enter the Number to find its square root: ");
        while (true) {
            if (!rcalc_Input.hasNextDouble()) {
                System.out.println("Invalid input, Please enter a Valid Number...");
                System.out.print("Enter the Number to find its square root: ");
                rcalc_Input.nextLine();
            }
            else {
                rcalc_InputNumber = rcalc_Input.nextDouble();
                rcalcOutputAnswer= Math.sqrt(rcalc_InputNumber);
                rcalc_Input.close();
                break;
            }
        }
        if (!(rcalcCanOutputAnswer)) {
            System.out.println("Calculating.Error.Unexpected");
        }
        else {System.out.println("Square root of "+ rcalc_InputNumber +" is "+rcalcOutputAnswer);}
    }
    public static void FactorialCalculator(){
        Scanner fcalc_Input = new Scanner(System.in);
        BigInteger fcalc_InputNumber = new BigInteger("0");
        BigInteger fcalc_OutputAnswer = new BigInteger("1");
        boolean fcalcCanOutputAnswer = true;
        System.out.print("Enter the Number to find its factorial: ");
        while (true) {
            if (!fcalc_Input.hasNextBigInteger()) {
                System.out.println("Invalid input, Please enter a Valid Number...");
                System.out.print("Enter the Number to find its factorial: ");
                fcalc_Input.nextLine();
            }
            else  {
                fcalc_InputNumber = fcalc_Input.nextBigInteger();
                break;
            }
        }
        for (BigInteger i=new BigInteger("1") ;i.compareTo(fcalc_InputNumber) <= 0;i =i.add(BigInteger.valueOf(1))) {
            fcalc_OutputAnswer = fcalc_OutputAnswer.multiply(i);
        }
        System.out.println("Factoriel of "+fcalc_InputNumber+" is "+fcalc_OutputAnswer);
    }
    public static void OddEvenCalculator(){
        Scanner oecalc_Input = new Scanner(System.in);
        int oecalc_InputNumber;
        System.out.print("Enter the Number to find its a odd or a even number: ");
        while(true) {
            if (!oecalc_Input.hasNextInt()) {
                System.out.println("Invalid input, Please enter a Valid Integer...");
                System.out.print("Enter the Number to find its a odd or a even number: ");
                oecalc_Input.nextLine();
            }
            else{
                oecalc_InputNumber = oecalc_Input.nextInt();
                break;
            }
        }
        if  (oecalc_InputNumber % 2 == 0) {
            System.out.print(oecalc_InputNumber + " is a even number");
        }
        else  {
            System.out.print(oecalc_InputNumber + " is a odd number");
        }
    }
}
