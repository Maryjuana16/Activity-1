/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication15;

/**
 *
 * @author Paden_CPE
 */
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number of Fibonacci numbers to generate
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        // Display the Fibonacci sequence
        System.out.println("Fibonacci sequence:");
        printFibonacci(n);

        // Close the scanner
        scanner.close();
    }

    // Function to print the first n numbers in the Fibonacci sequence
    private static void printFibonacci(int n) {
        int first = 0, second = 1, next;

        System.out.print(first + ", " + second);

        int count = 2; // Already printed the first two numbers

        while (count < n) {
            next = first + second;
            System.out.print(", " + next);

            // Update variables for the next iteration
            first = second;
            second = next;

            count++;
        }

        System.out.println(); // Move to the next line after printing the sequence
    }
}
