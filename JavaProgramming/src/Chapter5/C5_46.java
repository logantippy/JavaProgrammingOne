package Chapter5;

import java.util.Scanner;

/**
 * Program to display the user input reversed
 * 
 * @author Logan Sander
 */
public class C5_46 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    private static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Write something: ");
        String typed = input.nextLine();
        String reversed = new StringBuilder(typed).reverse().toString();
        System.out.println(reversed);
    }
}
