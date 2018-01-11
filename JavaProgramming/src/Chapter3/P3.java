package Chapter3;

import java.util.Scanner;

/**
 * Program to display a grade and how it relates to another grade
 *
 * @author Logan Sander
 */
public class P3 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write a number: ");
        int num1 = input.nextInt();
        System.out.println("Write another number: ");
        int num2 = input.nextInt();
        if (num1 < num2) {
            System.out.println("Number 1 is less than number 2.");
        }
        if (num1 > num2) {
            System.out.println("Number 1 is greater than number 2.");
        }
        if (num1 == num2) {
            System.out.println("Number 1 is equal to number 2.");
        }
        if (num1 <= num2) {
            System.out.println("number 1 is less than or equal to number 2.");
        }
        if (num1 != num2) {
            System.out.println("number 1 is not equal to number 2.");
        }
        if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
        } else {
            if (num1 / num2 < 1) {
                System.out.println("Proper Fraction.");
            } else {
                System.out.println("Improper Fraction.");
            }
        }
        if (num1 >= 90) {
            System.out.println("A");
        } else if (num1 >= 80) {
            System.out.println("B");
        } else if (num1 >= 70) {
            System.out.println("C");
        } else if (num1 >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        if ((num2 >= 1) && (num2 <= 100)) {
            System.out.println("In Range");
        } else {
            System.out.println("Out of Range");
        }
    }
}
