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
        //user Input   
        Scanner sc = new Scanner(System.in);

        //Declaring variables
        int firstinteger;
        int secondinteger;
        String operand;
        String sum = "+", rest = "-", multi = "*", division = "/";
        //User input the operator       
        System.out.println("Enter an operator: ");
        operand = sc.next();
        //User input the any number
        System.out.println("Enter an integer: ");
        firstinteger = sc.nextInt();
        //User input a second number
        System.out.println("Enter another integer: ");
        secondinteger = sc.nextInt();
        //add your inputs
        if (operand.equals(sum)) {
            System.out.println(firstinteger + secondinteger);
        }
        //substract your inputs
        if (operand.equals(rest)) {
            System.out.println(firstinteger - secondinteger);
        }
        //multiplicate your inputs
        if (operand.equals(multi)) {
            System.out.println(firstinteger * secondinteger);
        }
        //divide your inputs but it has some conditions
        if (operand.equals(division)) {
            if (secondinteger == 0) {
                System.out.println("Divide by zero error!");
            } else if (firstinteger < secondinteger) {
                System.out.println("0 and " + (firstinteger + "/" + secondinteger));
            } else if (firstinteger > secondinteger && firstinteger % secondinteger == 0) {
                System.out.println(firstinteger / secondinteger);
            } else {
                System.out.println((firstinteger / secondinteger) + " and "
                        + (firstinteger % secondinteger) + "/" + secondinteger);
            }

        } else if (!operand.equals(sum) && !operand.equals(rest)
                && !operand.equals(multi) && !operand.equals(division)) {
            System.out.println(operand + " is not a valid operator!");
        }

    }
}
