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
        System.out.println("print any one of these operators -,+,/,*");
        String userinput = keyboard.next();
        System.out.println("enter an number");
        int num1 = keyboard.nextInt();
        System.out.println(" another number");
        int num2 = keyboard.nextInt();

        int result = 0;
        int remainder = 0;
        String error = "";

        if (userinput.equals("+")) {
            result = num1 + num2;
        } else if (userinput.equals("-")) {
            result = num1 - num2;

        } else if (userinput.equals("*")) {
            result = num1 * num2;
        } else if (userinput.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
                remainder = num1 % num2;
            } else {
                error = "can't dvide by zero";
            }
        } else {
            error = "invalide operator";
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
