/*
 * Name: Future Investment Peer Review Exercise
 * Purpose: Computes future investment value at a given interest rate for a specified number of years
 * Programmer: Alex Kurcan
 * Date: 09/16/2025
 */

import java.util.Scanner;

public class FutureInvestment {
    // Method to calculate future investment value
    // amount = starting money
    // monthlyRate = interest rate divided by 12
    // years = how many years the money is invested
    public static double futureValue(double amount, double monthlyRate, int years) {
        return amount * Math.pow(1 + monthlyRate, years * 12);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: "); // user input for starting investment amount
        double amount = input.nextDouble();

        System.out.print("Enter annual rate (e.g., 9 for 9%): "); // user input for the rate
        double rate = input.nextDouble();

        // Converts the annual rate to monthly
        double mRate = rate / 1200;
        // Table header
        System.out.println("Year   Value");

        // Loops through the first 30 years
        for (int y = 1; y <= 30; y++) {
            double val = futureValue(amount, mRate, y); // calls method to calculate the future value
            System.out.println(y + "      " + val);
        }

        input.close();
    }
}
