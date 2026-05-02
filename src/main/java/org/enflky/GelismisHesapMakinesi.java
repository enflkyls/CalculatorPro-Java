package org.enflky;

import java.util.Scanner;

public class GelismisHesapMakinesi {
    public  static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        boolean usernumbercorrect = false;
        while (!(usernumbercorrect)) {
            if (!input.hasNextDouble()) {
                System.out.println("Invalid input, Please enter a Number...");
                System.out.print("Enter a number: ");
                input.nextLine();
            }
            else {
                double userInputNumber = input.nextDouble();
                System.out.print("Please enter a Operator:");
                usernumbercorrect = true;
            }
        }

        //int userNumber = input.nextInt();
        //System.out.print(userNumber);
    }
}
