/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author anualli
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        // Ask user to print any one of these operation 
        System.out.println("print any one of these operators with the keyboard -,+,/,*");
        // user input stored 
        String userinput = keyboard.next();
       // Ask you user for first number 
        System.out.println("enter an number");
        int num1 = keyboard.nextInt();
        // Ask you user for another number 
        System.out.println(" another number");
        int num2 = keyboard.nextInt();
        // If result equals 0 or remainder equals 0 print empty 
        int result = 0;
        int remainder = 0;
        String error = "";
        // If user enters + calculate num1 + num2 
        // if user enters - calculate num1 - num2 
        // if user enters* calculate num1 * num2
        // if user enters / check to see if num2 = 0 ,if not then calculate  result  num1 / num2 
        // if user enters / check to see if num2 = 0 ,if not then  calculate remainder num1 % num2 
        // if  num2 = 0 display an error message 
        // if  remainder doesn't equal zero  print fraction +remainder / + num 2 
          
        
        switch (userinput) {
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                if (num2 != 0) {
                    result = num1 / num2;
                    remainder = num1 % num2;
                } else {
                    error = "can't dvide by zero";
                }   break;
            default:
                error = "invalide operator";
                break;
        }

        if (error.equals("")) {
            System.out.println("result " + result);

            if (remainder != 0) {
                System.out.println("fraction " + remainder + "/" + num2);
            }
        } else {
            System.out.println(error);
        }

    }

}
