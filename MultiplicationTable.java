/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication16;

/**
 *
 * @author Paden_CPE
 */
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number for the multiplication table
        System.out.print("Enter an integer for the multiplication table: ");
        int baseNumber = scanner.nextInt();

        // Display the multiplication table
        System.out.println("Multiplication table for " + baseNumber + ":");
        printMultiplicationTable(baseNumber);

        // Close the scanner
        scanner.close();
    }

    // Function to print the multiplication table for a given number
    private static void printMultiplicationTable(int baseNumber) {
        for (int i = 1; i <= 10; i++) {
            int product = baseNumber * i;
            System.out.println(baseNumber + " x " + i + " = " + product);
        }
    }
}
