package Chapter2;

import java.util.Scanner;

/**
 * Program to display a gratuity and total charge
 *
 * @author Logan Sander
 */
public class C2_5 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the subtotal and grtuity rate: ");
        double sttl = input.nextDouble();
        double grat = input.nextDouble();
        double rate = grat / 100.0;
        double charge = rate * sttl;
        double ttl = charge + sttl;
        System.out.println("Gratuity: " + charge + ", " + "Total: " + ttl);
    }
}
