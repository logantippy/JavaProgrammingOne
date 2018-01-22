package Chapter8;

import java.util.Scanner;

/**
 * Program to add the sales of an employee on a certain day
 *
 * @author Logan Sander
 */

public class P8 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] names = {"A", "B", "C", "D"};
        String[] days = {"M", "T", "W", "H", "F"};
        double[][] sales = new double[4][5];
        String resp;
        do {
            System.out.println("Enter a name code (A, B, C, or D): ");
            String namecod = input.next();
            System.out.println("Enter a day code (M, T, W, H, F): ");
            String daycod = input.next();
            sales = placeValue(names, days, namecod, daycod, sales);
            do {
                System.out.println("Would you like to continue (y or n): ");
                resp = input.next();
            } while (!resp.equalsIgnoreCase("y") && !resp.equalsIgnoreCase("n"));
        } while (resp.equalsIgnoreCase("y"));
        System.out.println("    M   T    W   H   F");
        System.out.println("A [" + sales[0][0] + " " + sales[0][1] + " " + sales[0][2] + " " + sales[0][3] + " " + sales[0][4] + "]");
        System.out.println("B [" + sales[1][0] + " " + sales[1][1] + " " + sales[1][2] + " " + sales[1][3] + " " + sales[1][4] + "]");
        System.out.println("C [" + sales[2][0] + " " + sales[2][1] + " " + sales[2][2] + " " + sales[2][3] + " " + sales[2][4] + "]");
        System.out.println("D [" + sales[3][0] + " " + sales[3][1] + " " + sales[3][2] + " " + sales[3][3] + " " + sales[3][4] + "]");
    }

    /**
     *
     * @param names the names of the workers
     * @param days the days of the week
     * @param nc the name code
     * @param dc the day code
     * @param rate the array of the sales
     * @return the array
     */
    public static double[][] placeValue(String[] names, String[] days, String nc, String dc, double[][] rate) {
        Scanner input = new Scanner(System.in);
        int row = java.util.Arrays.binarySearch(names, nc);
        int column = 0;
        for (int i = 0; i < days.length; ++i) {
            if (days[i].equals(dc)) {
                column = i;
            }
        }
        System.out.println("Enter a new Sales: ");
        double price = input.nextDouble();
        rate[row][column] += price;
        return rate;
    }
}
