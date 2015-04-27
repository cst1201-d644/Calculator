/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculatorlab;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class CalculatorLab {
    private static int yearsToAdd;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Ask the user to input an operator.
        
        int operator;
        int num1, num2, answer = 0, answer2 = 0, answer3 = 0, answer4 = 0;
        System.out.println("Please enter #1 for addition,#2 for subtraction"
                + ",#3 for multiplication and #4 for division.");
       
        //Create a scanner to retrieve user input.
        Scanner scanner = new Scanner(System.in);
        
        //Retrieve user input.
        operator = scanner.nextInt();
        
        // Ask the user to input the integers.
        
        System.out.println("Please enter the first integer: ");
        int num = scanner.nextInt();
        System.out.println("Please enter another integer: ");
        num2 = scanner.nextInt();
                
        if (operator == 1)
        answer = num + num2;
        System.out.println("Your total is:" + answer + ".");
        
        if (operator == 2)
            answer2 = num - num2;
        System.out.println("Your total is:" + answer2 + ".");
        
        if (operator == 3)
            answer3 = num * num2;
        System.out.println("Your total is:" + answer3 + ".");
        
        if (operator == 4)
            answer4 = num / num2;
        System.out.println("Your total is:" + answer4 + ".");
    }
    
    
    
}
