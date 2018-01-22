package Chapter7;

/**
 * Program to display the order of scores from best to worst of students
 *
 * @author Logan Sander
 */
import java.util.Scanner;

public class C7_1 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int best = 0;
        System.out.println("Enter the number of students: ");
        int num = input.nextInt();
        int[] score = new int[num];
        System.out.println("Enter " + num + " scores: ");
        for (int x = 0; x <= num; ++x) {
            score[x] = input.nextInt();
            if (best < score[x]) {
                best = score[x];
            }
        }
        for (int x = 0; x <= num; ++x) {
            if (score[x] >= (best - 10)) {
                System.out.println("Student " + x + " Scored: " + score[x] + ", and grade is: A");
            } else if (score[x] >= (best - 20)) {
                System.out.println("Student " + x + " Scored: " + score[x] + ", and grade is: B");
            } else if (score[x] >= (best - 30)) {
                System.out.println("Student " + x + " Scored: " + score[x] + ", and grade is: C");
            } else if (score[x] >= (best - 40)) {
                System.out.println("Student " + x + " Scored: " + score[x] + ", and grade is: D");
            } else {
                System.out.println("Student " + x + " Scored: " + score[x] + ", and grade is: F");
            }
        }
    }
}
