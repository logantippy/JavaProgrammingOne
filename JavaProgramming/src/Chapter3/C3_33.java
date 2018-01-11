package Chapter3;

import java.util.Scanner;

/**
 * Program to display a comparison of two deals
 *
 * @author Logan Sander
 */
public class C3_33 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter weight and price of first package: ");
        double wt1 = input.nextDouble();
        double prc1 = input.nextDouble();
        System.out.println("Enter weight and price of second package: ");
        double wt2 = input.nextDouble();
        double prc2 = input.nextDouble();

        if ((prc1 / wt1) < (prc2 / wt2)) {
            System.out.println("The first package is a better deal.");
        } else if ((prc2 / wt2) < (prc1 / wt1)) {
            System.out.println("The second package is a better deal.");
        } else {
            System.out.println("They are both the same deal.");
        }
    }
}
