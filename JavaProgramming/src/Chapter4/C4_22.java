package Chapter4;

import java.util.Scanner;

/**
 * Program to display if a substring is within a string
 *
 * @author Logan Sander
 */
public class C4_22 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();
        System.out.print("Enter a substring: ");
        String sub1 = input.nextLine();
        if (s1.toLowerCase().contains(sub1.toLowerCase())) {
            System.out.println("    String: '" + s1 + "' contains substring: " + sub1);
        } else {
            System.out.println("    String: '" + s1 + "' is not containing substring: " + sub1);
        }
    }
}
