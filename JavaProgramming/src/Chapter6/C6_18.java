package Chapter6;

import java.util.Scanner;

/**
 * Program to check the validity of a password
 *
 * @author Logan Sander
 */
public class C6_18 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Correct = "Valid Password";
        System.out.println("Enter your password: ");
        String pass = input.next();
        if (checkLength(pass).equals("no")) {
            Correct = "Invalid Password";
        } else if (lettersAndDigits(pass).equals("no")) {
            Correct = "Invalid Password";
        } else if (containsTwoDigs(pass).equals("no")) {
            Correct = "invalid Password";
        }
        System.out.println(Correct);
    }

    /**
     * checkLength Method
     * 
     * @param pass The inputed password
     * 
     * @return Either "yes" or "no" depending on validity
     */
    public static String checkLength(String pass) {
        if (pass.length() >= 8) {
            return "yes";
        } else {
            return "no";
        }
    }

    /**
     * lettersAndDIgits Method
     * 
     * @param pass The inputed password
     * 
     * @return Either "yes" or "no" depending on validity
     */
    public static String lettersAndDigits(String pass) {
        int no = 0;
        for (int x = 0; x < pass.length(); x++) {
            if (!Character.isLetterOrDigit(pass.charAt(x))) {
                ++no;
            }
        }
        if (no == 0) {
            return "yes";
        } else {
            return "no";
        }
    }

    /**
     *  containsTwoDigits Method
     *
     * @param pass The inputed password
     * 
     * @return Either "yes" or "no" depending on validity
     */
    public static String containsTwoDigs(String pass) {
        int counter = 0;
        for (int x = 0; x < pass.length(); x++) {
            if (Character.isDigit(pass.charAt(x))) {
                ++counter;
            }
        }
        if (counter >= 2) {
            return "yes";
        } else {
            return "no";
        }
    }

}
