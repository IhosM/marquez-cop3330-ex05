/*
 *  UCF COP3330 Fall 2021 Assignment 5 Solution
 *  Copyright 2021 Ihosvany Marquez
 */


package Exercise5;

import java.util.Scanner;


public class Solution5
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the first number? ");
        String input1 = scan.nextLine();

        System.out.print("What is the second number? ");
        String input2 = scan.nextLine();

        int number1 = Integer.parseInt(input1);
        int number2 = Integer.parseInt(input2);
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int product = number1 * number2;
        int quotient = number1 / number2;

        System.out.println(number1 + " + " + number2 + " = " + addition + "\n" + number1 +  " - " + number2 + " = "
                        + subtraction + "\n" + number1 + " * " + number2 + " = " + product +
                        "\n" + number1 + " / " + number2 +  " = " + quotient);
    }
}
