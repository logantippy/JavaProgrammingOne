package Chapter7;

import java.util.Scanner;

/**
 * Program to get display the values and average of an array
 *
 * @author Logan Sander
 */
public class P7 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array length: ");
        int leng = input.nextInt();
        int[] array = new int[leng];
        array = getValues(array);
        double avg = getAvg(array);
        printArray(array, avg);
    }

    /**
     * getValues Method
     *
     * @param array the empty array
     *
     * @return the array with values
     */
    public static int[] getValues(int[] array) {
        Scanner input = new Scanner(System.in);
        for (int x = 0; x < array.length; ++x) {
            System.out.println("Enter the value: ");
            array[x] = input.nextInt();
        }
        return array;
    }

    /**
     * getAvg Method
     *
     * @param array the array with values
     *
     * @return the average of the array's values
     */
    public static double getAvg(int[] array) {
        double avg = 0;

        for (int x = 0; x < array.length; ++x) {
            avg += array[x];
        }
        avg = avg / array.length;
        return avg;
    }

    /**
     * printArray Method
     *
     * @param array the array with values
     *
     * @param avg the average of the array's values
     */
    public static void printArray(int[] array, double avg) {
        System.out.print("Array: ");
        for (int x = 0; x < array.length; ++x) {
            System.out.print(array[x] + " ");
        }
        System.out.println("Average: " + avg);
    }

}
