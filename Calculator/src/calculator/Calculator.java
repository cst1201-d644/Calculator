/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author Francisco Latacela & Goutam Kundu
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num1;
        int num2;

        // This is The String Operiation ( Here We Have All The Operation) 
        String operations;
        String opert1 = "+",
                opert2 = "-",
                opert3 = "*",
                opert4 = "/";

        //This Is Allowing User to input From the KeyBoard  
        Scanner keyboard = new Scanner(System.in);

        //This is Where User Will be Chosing Any Operation   
        System.out.println("Please Enter An Operator Here: ");
        operations = keyboard.next();

        //This is Where User Will Input Any Number That They Want to Choose 
        //we are using (num1) To represent This  
        System.out.println("Please Enter An Integer: ");
        num1 = keyboard.nextInt();

        //This Is Where User Will Input The Number That They Want to use with the number That 
        //they Type eiailer & we are using (num2) To represent This  
        System.out.println("Type Another Integer:");
        num2 = keyboard.nextInt();

        //This is Where user Will get Answer If they have selected "+"operand
        if (operations.equals(opert1)) {
            System.out.println("Your Answer Is: " + (num1 + num2));
        }

        //This is Where user Will get Answer If they have selected "-"operand
        if (operations.equals(opert2)) {
            System.out.println("Your Answer Is: " + (num1 - num2));
        }

        //This is Where user Will get Answer If they have selected "*"operand
        if (operations.equals(opert3)) {
            System.out.println("Your Answer Is: " + (num1 * num2));
        }
        //This is where user will get answer if they have seleceted "/"operand 
        // And the different result that this operand can display
        if (operations.equals(opert4)) {
            if (num2 == 0) {
                System.out.println("Divide by zero error!!!");
            } else if (num1 < num2) {
                System.out.println("0 and " + (num1 + "/" + num2));
            } else if (num1 > num2 && num1 % num2 == 0) {
                System.out.println("Your Answer Is: " + num1 / num2);
            } else //
            {
                System.out.println("Your Answer Is: " + (num1 / num2) + " and "
                        + (num1 % num2) + "/" + num2);
            }

        } else if (!operations.equals(opert1) && !operations.equals(opert2)
                && !operations.equals(opert3) && !operations.equals(opert4)) {
            System.out.println(operations + " Is Not A Valid Operator!");
        }
    }

}
