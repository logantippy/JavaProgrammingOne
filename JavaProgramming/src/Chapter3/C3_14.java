package Chapter3;

import java.util.Scanner;

/**
 * Program to display a coin flip
 *
 * @author Logan Sander
 */
public class C3_14 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = (int) (Math.random() * 2);
        System.out.println("heads or tails? ");
        String answer;
        String Comp1 = "heads";
        String Comp2 = "tails";
        answer = input.nextLine();
        if (result == 0) {
            if (answer.equals(Comp1)) {
                System.out.println("Yes! It was heads.");
            } else {
                System.out.println("No, it was heads!");
            }
        }
        if (result == 1) {
            if (answer.equals(Comp2)) {
                System.out.println("Yes! It was tails.");
            } else {
                System.out.println("No, it was tails!");
            }
        }
    }
}
