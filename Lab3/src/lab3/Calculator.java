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

    public static void main(String[] args) {
        // Set up a scanner variable
        Scanner keyboard = new Scanner(System.in);
        String operator;
        int num1, num2, answer;
        answer = 0;

        // Ask the user for an operator
        System.out.print("Enter an operator");
        operator = keyboard.next();

        // Ask the user for an integer
        System.out.print("Enter an integer");
        num1 = keyboard.nextInt();
        
        // Ask the user for another integer
        System.out.print("Enter another integer");
        num2 = keyboard.nextInt();
        
        // Figuring out what operator did the user choose
        if (operator.equals("+")) {
            answer = num1 + num2;
            System.out.println(answer);
        } else if (operator.equals("-")) {
            answer = num1 - num2;
            System.out.println(answer);
        } else if (operator.equals("*")) {
            answer = num1 * num2;
            System.out.println(answer);
        } else if (operator.equals("/")) {
            if (num2 == 0) {
                System.out.println("Divide by zerro error! ");
            } else {
                int remainder = num1 % num2;
                answer = num1 / num2;
                if (remainder == 0) {
                    System.out.println(answer);
                } else {
                    System.out.println(answer + " and " + remainder + "/" + num2);
                }
            }
        } else {
            System.out.println(operator + " is not a valid operator!");
        }
    }

}
