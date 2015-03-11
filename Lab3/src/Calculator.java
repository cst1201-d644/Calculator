/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Winnie Wu, Kenny Tsang
 */

import java.util.Scanner;
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1, num2;
        String operation;
        Scanner keyboard = new Scanner(System.in);

        // Ask the user to enter an operator.
        Scanner operator = new Scanner(System.in);
        System.out.println("Enter your operation:");
        operation = operator.next();
        
        // Ask the user to enter an integer.
        System.out.println("Enter an integer:");
        num1 = keyboard.nextDouble();

        // Ask the user to enter another integer.
        System.out.println("Enter another integer:");
        num2 = keyboard.nextDouble();

        if (operation.equals("+"))
        {
    System.out.println("your answer is " + (num1 + num2));
}
        else if (operation.equals("-"))
        {
    System.out.println("your answer is " + (num1 - num2));
}
        else if (operation.equals("/"))
        {
    System.out.println("your answer is " + (num1 / num2));
}
        else if (operation.equals("*"))
        {
    System.out.println("your answer is " + (num1 * num2));
}

        }

}
