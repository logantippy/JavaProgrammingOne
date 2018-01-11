package Chapter2;

import java.util.Scanner;

/**
 * Program to display Area and Volume
 *
 * @author Logan Sander
 */
public class C2_2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius and length: ");
        double rad = input.nextDouble();
        double len = input.nextDouble();
        double area = rad * rad * 3.14;
        double vol = area * len;
        System.out.println("Area: " + area + ", " + "Volume: " + vol);
    }
}
