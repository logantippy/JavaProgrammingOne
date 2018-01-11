package Chapter2;

import java.util.Scanner;

/**
 * Program to display Fahrenheit converted from Celsius
 *
 * @author Logan Sander
 */
public class C2_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double fahr = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the Temperature (C): ");
        double cel = input.nextDouble();
        fahr = (9.0 / 5) * cel + 32;
        System.out.println(cel + " Celsius is " + fahr + "Fahrenheit.");
    }
}
