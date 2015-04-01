/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author MingJie
 */
public class calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double num1, num2, answer;
        int operator;
        print("Please enter a operator 1 for +, 2 for -, 3 for * or 4 for / ");
        Scanner scan = new Scanner(System.in);
        operator = scan.nextInt();

        if (operator == 1) {
            print("enter your first number");
            num1 = scan.nextInt();
            print("enter your second number");
            num2 = scan.nextInt();
            answer = num1 + num2;
            print("" + answer);}

            if (operator == 2) {
            print("enter your first number");
            num1 = scan.nextInt();
            print("enter your second number");
            num2 = scan.nextInt();
            answer = num1 - num2;
            print("" + answer);}
            
            if(operator ==3){
            print("enter your first number");
            num1 = scan.nextInt();
            print("enter your second number");
            num2 = scan.nextInt();
            answer = num1 * num2;
            print("" + answer);}
            
            if (operator==4){
            print("enter your first number");
            num1 = scan.nextInt();
            print("enter your second number");
            num2 = scan.nextInt();
            answer = num1 % num2;
            print("" + answer);}
            
         
        
            
    }

    public static void print(String s) {
        System.out.println(s);
    }
}
