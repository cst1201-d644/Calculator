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
        // TODO code application logic here
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an operator: ");
        String operator = keyboard.next();
        System.out.println("Enter an integer1: ");
        int integer1 = keyboard.nextInt();
        System.out.println("Enter an integer2: ");
        int integer2 = keyboard.nextInt();
        
        
        int math1 = integer1 + integer2;
        int math2 = integer1 - integer2;
        int math3 = integer1 * integer2;
        int math4 = integer1 / integer2;
        
        if (operator.equals("+"))
        System.out.println("Your answer is: " + math1); 
        
        else if (operator.equals("-"))
        System.out.println("Your answer is: " + math2);
        
        if (operator.equals("*"))
        System.out.println("Your answer is: " + math3);
        
        else if (operator.equals("/"))
        System.out.println("Your answer is: " + math4);
        
        
    }
    
}
