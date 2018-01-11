package Chapter4;

import java.util.Scanner;

/**
 * Program to calculate the pay of an employee
 *
 * @author Logan Sander
 */
public class C4_23 {

    /**
     * Main Method
     *
     * @param args arguments from command line prompt
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name: ");
        String name = input.nextLine();
        System.out.println("Enter hours worked: ");
        double worked = input.nextDouble();
        System.out.println("Enter hourly wage: ");
        double wage = input.nextDouble();
        double grossPay = worked * wage;
        System.out.println("Enter the Federal Tax: ");
        double ft = input.nextDouble();
        System.out.println("Enter the State Tax: ");
        double st = input.nextDouble();
        double stat = st * grossPay;
        double fed = ft * grossPay;
        double tax = fed + stat;
        double netpay = grossPay - tax;
        System.out.printf("\nEmployee Name: %s", name);
        System.out.printf("\nHours Worked: %.2f", worked);
        System.out.printf("\nPayRate: $%.2f", wage);
        System.out.printf("\nGross Pay: $%.2f", grossPay);
        System.out.printf("\nDeductions:\n   Federal Witholding (%.2f%%): $%.2f\n   State Witholding (%.2f%%): $%.2f\n   Total Deduction: $%.2f", (ft * 100), fed, (st * 100), stat, (fed + stat));
        System.out.printf("\nNet Pay: $%.2f", netpay);
    }
}
