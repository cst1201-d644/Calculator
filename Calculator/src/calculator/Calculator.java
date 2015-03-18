/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calculator;
import java.util.Scanner;
/**
 *
 * @author JianLang LIn,Ziying guo
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               int num1,num2;
        String operation;
        Scanner keyboard=new Scanner(System.in);
        System.out.print("Enter operation to perform(+,-,*,/):");
        operation=keyboard.next();
        System.out.print("Enter First Number: ");
        num1=keyboard.nextInt();
        System.out.print("Enter Second Number: ");
        num2=keyboard.nextInt();
        if (operation.equals("+")){
            System.out.println(num1+num2);
       }
        else if (operation.equals("-")){
            System.out.println(num1-num2);}
        else if (operation.equals("*")){
            System.out.println(num1*num2);}
        else if (operation.equals("/")){
            if (num2==0)
                System.out.print("Divided by Zero Error");
            if ((num1%num2)>0)
                System.out.println((num1/num2)+" and "+(num1%num2)+"/"+num2);
            else 
                System.out.println(num1/num2);
             }
       else {
            System.out.println("That is a error you type");}
        
    }
    
}

    
    
