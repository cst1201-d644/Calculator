/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Evan Chin
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;

        String operation;
        String operator1 = "+",
                operator2 = "-",
                operator3 = "*",
                operator4 = "/";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an operation(+,-,*,/): ");
        operation = keyboard.next();

        System.out.println("Enter an integer:");
        num1 = keyboard.nextInt();

        System.out.println("Enter another integer:");
        num2 = keyboard.nextInt();

        if (operation.equals(operator1)) {
            System.out.println("Answer: " + (num1 + num2));
        }

        if (operation.equals(operator2)) {
            System.out.println("Answer: " + (num1 - num2));
        }

        if (operation.equals(operator3)) {
            System.out.println("Answer: " + (num1 * num2));
        }

        if (operation.equals(operator4)) {
            if (num2 == 0) {
                System.out.println("Divide by zero error!!!");
            } else if (num1 < num2) {
                System.out.println("0 and " + (num1 + "/" + num2));
            } else if (num1 > num2 && num1 % num2 == 0) {
                System.out.println("Answer: " + num1 / num2);
            } else {
                System.out.println("Answer: " + (num1 / num2) + " and " + (num1 % num2) + "/" + num2);
            }
        } else if (!operation.equals(operator1) && !operation.equals(operator2) && !operation.equals(operator3) && !operation.equals(operator4)) {
            System.out.println(operation + " is not a valid operator!");
        }
    }
}
