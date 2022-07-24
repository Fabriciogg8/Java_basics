/*
11. Write a Java program to print the area and perimeter of a circle.
*/

import java.util.Scanner;

public class Problem11{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("Radius: ");
            int number1 = scanner.nextInt();
            
            Double perimeter = (number1*(2*3.14));
            Double area = (Math.pow(number1,2)*3.14);

            System.out.println("The perimeter is: " + perimeter);
            System.out.println("The area is: " + area);


        } finally {
            scanner.close();
        }
    }
}