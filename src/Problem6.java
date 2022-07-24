/*
 6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers. 
 */

import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Input first number: ");
            int number1 = scanner.nextInt();
            System.out.println("Input second number: ");
            int number2 = scanner.nextInt();
            System.out.println(number1 + " + " + number2 + " = " + (number2+number1));
            System.out.println(number1 + " - " + number2 + " = " + (number2-number1));
            System.out.println(number1 + " * " + number2 + " = " + (number2*number1));
            System.out.println(number1 + " / " + number2 + " = " + (number2/number1));
            System.out.println(number1 + " mod " + number2 + " = " + (number2%number1));
        } finally {
            scanner.close();
        }
    }
}
