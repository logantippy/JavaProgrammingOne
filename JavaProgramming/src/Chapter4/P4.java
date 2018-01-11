package Chapter4;

import java.util.Scanner;

/**
 * Program to display a comparison of two offers
 *
 * @author Logan Sander
 */
public class P4 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name1;
        String name2;
        System.out.println("Enter Bidder 1: ");
        name1 = input.next();
        System.out.println("Enter the hours of work required: ");
        double hours1 = input.nextDouble();
        System.out.println("Enter the hourly charge: ");
        double rate1 = input.nextDouble();
        System.out.println("Enter Bidder 2: ");
        name2 = input.next();
        System.out.println("Enter the hours of work required: ");
        double hours2 = input.nextDouble();
        System.out.println("Enter the hourly charge: ");
        double rate2 = input.nextDouble();
        double cost1 = rate1 * hours1;
        double cost2 = rate2 * hours2;
        if (cost1 < cost2) {
            System.out.printf("%s has a lower price of %.2f", name1, rate1);
        } else if (cost1 > cost2) {
            System.out.printf("%s has a lower price of %.2f", name2, rate2);
        } else if (cost1 == cost2) {
            if (hours1 < hours2) {
                System.out.printf("%s has lower hours of %.2f", name1, hours1);
            } else if (hours1 > hours2) {
                System.out.printf("%s has lower hours of %.2f", name2, hours2);
            } else if (hours1 == hours2) {
                System.out.printf("Both have %.2f hours and prices of %.2f", hours1, rate1);
            }
        }
    }
}
