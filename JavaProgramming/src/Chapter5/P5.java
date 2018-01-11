package Chapter5;

import java.util.Scanner;

/**
 * Program to count the number of votes for and against something
 * 
 * @author Logan Sander
 */
public class P5 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        int yay = 0, nay = 0;
        Scanner input = new Scanner(System.in);
        String response;
        do {
            System.out.println("Enter y for yes, n for no, or q to quit: ");
            response = input.next();

            if (!response.equalsIgnoreCase("n") && !response.equalsIgnoreCase("y") && !response.equalsIgnoreCase("q")) {
                System.out.println("Invalid input.");
            } else if (response.toLowerCase().equals("y")) {
                ++yay;
            } else if (response.toLowerCase().equals("n")) {
                ++nay;
            }
        } while (!response.equalsIgnoreCase("q"));
        System.out.println("Votes no: " + nay + ", Votes yes: " + yay);
    }
}
