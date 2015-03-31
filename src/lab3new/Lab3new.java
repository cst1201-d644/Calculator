/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab3new;

import java.util.Scanner;

/**
 *
 * @author class
 */
public class Lab3new {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an operator: ");
        String operator = keyboard.next();
        System.out.println("Enter an integer: ");
        int integer = keyboard.nextInt();
        System.out.println("Enter an integer1");
        int integer1 = keyboard.nextInt();
        
        int math1 = integer + integer1; 
        int math2 = integer - integer1;
        int math3 = integer * integer1;
        int math4 = integer / integer1;
        
        if (operator.equals("+"))
            System.out.println("The answer is: " + math1);
        
        else if (operator.equals("-"))
            System.out.println("The answer is: " + math2);
        
        if (operator.equals("*"))
            System.out.println("The answer is: " + math3);
        
        else if (operator.equals("/"))
            System.out.println("The answer is: " + math4);
        
        
    }
    
}
