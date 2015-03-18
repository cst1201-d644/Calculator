package lab3;

import java.util.Scanner;

/**
 *
 * @author Danish Khan and Dheyazen Alseelwe
 */
public class Calculator {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an operator : ");
        String operator = keyboard.next();
        System.out.println("Enter an integer :");
        int integer = keyboard.nextInt();
        System.out.println("Enter another integer :");
        int integer2 = keyboard.nextInt();
        int result = 0;

        switch (operator) {

            case "/":
                if (integer2 == 0) {
                    System.out.println("Divide by zero error!");
                    break;

                } else {

                    result = integer / integer2;

                    //check for the fractional part.
                    int remainder = integer % integer2;

                    if (remainder == 0) {
                        System.out.println(result);
                    } else { //fraction exists.
                        System.out.println(result + " and " + remainder + "/" + integer2);
                    }
                }

                break;

            case "*":
                result = integer * integer2;
                System.out.println(result);
                break;

            case "+":
                result = integer + integer2;
                System.out.println(result);
                break;

            case "-":
                result = integer - integer2;
                System.out.println(result);
                break;

            default:
                operator = "invalid operator";
                break;

        }
    }

}
