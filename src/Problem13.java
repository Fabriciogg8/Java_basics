/*
 13. Write a Java program to print the area and perimeter of a rectangle.
 */

import java.util.Scanner;

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Let's calculate the size of a rectangle.." + "\n" + "Enter the first side: ");
            int number1 = scanner.nextInt();
            System.out.println("Enter the second side: ");
            int number2 = scanner.nextInt();
            System.out.println("The perimeter is: " + "(2x" + number1 + ") + (2x" + number2 + ")=" + (2*number2+2*number1));
            System.out.println("The area is: " + number1 + "x" + number2 + "=" + (number2*number1));
        } finally {
            scanner.close();
        }
    }
}
