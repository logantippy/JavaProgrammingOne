package Chapter7;

import java.util.Scanner;

/**
 * Program to display the minimum value of an array
 *
 * @author Logan Sander
 */
public class C7_9 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        for (int x = 0; x <= 10; ++x) {
            System.out.println("Enter a number: ");
            numbers[x] = input.nextDouble();
        }
        min(numbers);
    }

    /**
     * min Method
     *
     * @param array the array used to find the minimum
     */
    public static void min(double[] array) {
        double min;
        java.util.Arrays.sort(array);
        min = array[0];
        System.out.println("Minimum: " + min);
    }
}
