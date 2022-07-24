/*
 12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers
 */

import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the first number: ");
            int number1 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int number2 = scanner.nextInt();

            System.out.println("Enter the second number: ");
            int number3 = scanner.nextInt();
            System.out.println("The average is: " + (number2+number1+number3)/3);
        } finally {
            scanner.close();
        }
    }
}
