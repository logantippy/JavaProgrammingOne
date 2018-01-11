package Chapter3;

import java.util.Scanner;

/**
 * Program to display to test a number and relations to 5 and 6
 *
 * @author Logan Sander
 */
public class C3_26 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inpt = input.nextInt();

        if ((inpt % 5 == 0) && (inpt % 6 == 0)) {
            System.out.println("Is " + inpt + " divisible by 5 and 6, yes.");
        } else {
            System.out.println("Is " + inpt + " divisible by 5 and 6, no.");
        }

        if ((inpt % 5 == 0) || (inpt % 6 == 0)) {
            System.out.println("Is " + inpt + " divisible by 5 or 6, yes");
        } else {
            System.out.println("Is " + inpt + " divisible by 5 or 6, no");
        }
        if ((inpt % 5 == 0) ^ (inpt % 6 == 0)) {
            System.out.println("Is " + inpt + " divisible by 5 or 6, but not both, yes");
        } else {
            System.out.println("Is " + inpt + " divisible by 5 or 6, but not both, no");
        }
    }
}
