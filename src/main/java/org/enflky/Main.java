package org.enflky;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int userNumber = 1;
        boolean numberFound = false;
        while (!numberFound) {
            if (input.hasNextInt()) {
                userNumber = input.nextInt();
                numberFound = true;
            }
            else {
                System.out.println("Invalid input Please enter an integer");
                System.out.print("Enter a number: ");
                input.nextLine();
            }
        }


        int answer = userNumber % 2;
        if (answer == 1) {
            System.out.println(userNumber + " Is a Odd number");
        }
        else {
            System.out.println(userNumber + " Is a Even number");
        }
    }
}