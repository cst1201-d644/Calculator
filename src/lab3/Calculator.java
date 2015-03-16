/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;
        
        String operator;
        String operator1 = "+",
                operator2 = "-",
                operator3 = "*",
                operator4 = "/";

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter an operation(+,-,*,/): ");
        operator = keyboard.next();

        System.out.println("Enter an integer: ");
        num1 = keyboard.nextInt();

        System.out.println("Enter another integer: ");
        num2 = keyboard.nextInt();

        if (operator.equals(operator1)) {
            System.out.println(num1 + num2);
        }

        if (operator.equals(operator2)) {
            System.out.println(num1 - num2);
        }

        if (operator.equals(operator3)) {
            System.out.println(num1 * num2);
        }

        if (operator.equals(operator4)) {
            if (num1 < num2) {
                System.out.println("0 and ");
                System.out.println(num1 % num2);
            if (num2 == 0) {
            System.out.println("Division by zero is not possible.");}
            }
        }
        
            else if (!operator.equals(operator)){
            System.out.println(operator + " is not a valid operator!");
        }
    }
}
