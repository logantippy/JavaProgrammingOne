package Chapter2;

import java.util.Scanner;

/**
 * Program to display a meal bill
 *
 * @author Logan Sander
 */
public class P2 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        double food = 0, drink = 0, dessert = 0, meal = 0, tax = 0, tip = 0, total = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("What was the cost of your food?");
        food = input.nextDouble();

        System.out.println("What was the cost of your drink?");
        drink = input.nextDouble();

        System.out.println("What was the cost of your dessert?");
        dessert = input.nextDouble();

        meal = food + drink + dessert;
        tax = meal * 0.1;
        tip = (meal + tax) * 0.15;
        total = meal + tax + tip;

        System.out.println("Meal: $" + meal);
        System.out.println("Sales Tax: $" + tax);
        System.out.println("Tip: $" + tip);
        System.out.println("------------------");
        System.out.println("Total Cost: $" + total);
    }
}
