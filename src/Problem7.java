/*
 7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
 */

import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Enter the first number: ");
            int number1 = scanner.nextInt();
            for (int index = 1; index <= 10; index++) {
                System.out.println(number1 + " * " + index + " = " + (number1*index));     
            }
        } finally {
            scanner.close();
        }
    }
}
