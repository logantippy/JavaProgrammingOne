package Chapter6;

import java.util.Scanner;

/**
 * Program to convert form Dollars to another currency
 *
 * @author Logan Sander
 */
public class P6 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String resp, type;
        double amount;
        System.out.println("Euros -> USD rate: ");
        double e2d = input.nextDouble();
        System.out.println("GBP -> USD rate: ");
        double p2d = input.nextDouble();
        System.out.println("Yen -> USD rate: ");
        double y2d = input.nextDouble();
        do {
            System.out.println("Enter the amount of USD: ");
            amount = input.nextDouble();
            System.out.println("Enter Y, P, or E to convert: ");
            type = input.next();

            if (type.equalsIgnoreCase("y")) {
                System.out.printf("%.2f Dollars is %.2f %s. \n", amount, convert(y2d, amount), type);
            } else if (type.equalsIgnoreCase("p")) {
                System.out.printf("%.2f Dollars is %.2f %s. \n", amount, convert(p2d, amount), type);
            } else if (type.equalsIgnoreCase("e")) {
                System.out.printf("%.2f Dollars is %.2f %s. \n", amount, convert(e2d, amount), type);
            }
            do {
                System.out.println("Convert more (yes/no): ");
                resp = input.next();
            } while (!resp.equalsIgnoreCase("no") && !resp.equalsIgnoreCase("yes"));
        } while (resp.equalsIgnoreCase("yes"));
    }

    /**
     * convert Method
     *
     * @param rate The exchange rate to another currency
     *
     * @param amount The amount of money being converted
     *
     * @return The amount of converted currency
     */
    public static double convert(double rate, double amount) {
        double curr, ttl, money;
        if (amount <= 100) {
            ttl = amount - (amount * 0.1);
            money = ttl * rate;
        } else {
            ttl = amount - (amount * 0.05);
            money = ttl * rate;
        }
        curr = money;
        return curr;
    }
}
