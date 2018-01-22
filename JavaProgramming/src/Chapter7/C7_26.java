package Chapter7;

/**
 * Program to display if two arrays are equivalent
 *
 * @author Logan Sander
 */
import java.util.Scanner;

public class C7_26 {

    public static void main(String[] args) {
        /**
         * Main Method
         *
         * @param args arguments from command line prompt
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the Array: ");
        int[] list1 = new int[input.nextInt()];

        System.out.println("Enter a value for list 1: ");
        for (int x = 0; x < list1.length; ++x) {
            list1[x] = input.nextInt();

        }
        System.out.println("Enter the length of the Array: ");
        int[] list2 = new int[input.nextInt()];
        System.out.println("Enter a value for list 2: ");
        for (int x = 0; x < list2.length; ++x) {
            list2[x] = input.nextInt();

        }
        System.out.println(equals(list1, list2));
    }

    /**
     * equals Method
     *
     * @param list1 the first array
     *
     * @param list2 the second array
     *
     * @return the boolean value of if the arrays are equal
     */
    public static boolean equals(int[] list1, int[] list2) {

        return java.util.Arrays.equals(list1, list2);
    }
}
