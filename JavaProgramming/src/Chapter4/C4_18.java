package Chapter4;

import java.util.Scanner;

/**
 * Program to display the year and class of a student
 *
 * @author Logan Sander
 */
public class C4_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Class;
        String Rank;
        System.out.println("Math (M), Computer Science (C), Information Technology (I)");
        System.out.print("Major: ");
        String major = input.next();
        System.out.println("Freshman(1), Sophomore(2), Junior(3), Senior(4)");
        System.out.print("Grade: ");
        int grade = input.nextInt();
        if (grade != 1 || grade != 2 || grade != 3 || grade != 4) {
            System.out.println("Invalid Input.");
            System.exit(0);
        }
        if (major.toLowerCase().equals("m")) {
            Class = "Mathematics";
        } else if (major.toLowerCase().equals("c")) {
            Class = "Computer Science";
        } else if (major.toLowerCase().equals("i")) {
            Class = "Information Technology";
        } else {
            Class = "Invalid Input.";
        }
        if (grade == 1) {
            Rank = "Freshman";
        } else if (grade == 2) {
            Rank = "Sophomore";
        } else if (grade == 3) {
            Rank = "Junior";
        } else if (grade == 4) {
            Rank = "Senior";
        } else {
            Rank = "";
        }
        System.out.println(Class + " " + Rank);
    }
}
