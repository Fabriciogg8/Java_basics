/*
5. Write a Java program that takes two numbers as input and display the product of two numbers.
*/

import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        System.out.println(number2*number1);
    }
}
