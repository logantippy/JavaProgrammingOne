package Chapter5;

import java.util.Scanner;

/**
 * Program to display the outcome of rock, paper, scissors against the computer
 * 
 * @author Logan Sander
 */
public class C5_34 {
    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uwin = 0, cwin = 0;
        do {
            System.out.println("Rock [0], Paper [1], Scissors [2]");
            int user = input.nextInt();
            int pc = (int) (Math.random() * 3);
            if (user == 0) {
                if (pc == 1) {
                    System.out.println("Computer Wins!");
                    ++cwin;
                } else if (pc == 2) {
                    System.out.println("Player Wins!");
                    ++uwin;
                } else {
                    System.out.println("Tie!");
                }
            } else if (user == 1) {
                if (pc == 0) {
                    System.out.println("Player Wins!");
                    ++uwin;
                } else if (pc == 2) {
                    System.out.println("Computer Wins!");
                    ++cwin;
                } else {
                    System.out.println("Tie!");
                }
            } else if (user == 2) {
                if (pc == 0) {
                    System.out.println("Computer Wins!");
                    ++cwin;
                } else if (pc == 1) {
                    System.out.println("Player Wins!");
                    ++uwin;
                } else {
                    System.out.println("Tie!");
                }
            }
        } while (uwin < 2 && cwin < 2);
    }

}
