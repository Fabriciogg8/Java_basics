/*
 15. Write a Java program to swap two variables
 */

public class Problem15 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 8;
        int swap;

        System.out.println("Before swapping : number1, number2 = "+number1+", "+ number2);

        swap = number1;
        number1 = number2;
        number2 = swap;

        System.out.println("After swapping number1 is: " +number1+ ", and the value of number2 is: " + number2);
    }
}
