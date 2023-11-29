/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prime;

/**
 *
 * @author Paden_CPE
 */
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the number to check for primality
        System.out.print("Enter a positive integer to check for primality: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(number);

        // Display the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        // Close the scanner
        scanner.close();
    }

    // Function to check if a number is prime using a do-while loop
    private static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        int divisor = 2;

        do {
            // Check if the number is divisible by the current divisor
            if (num % divisor == 0) {
                return false; // It's not a prime number
            }

            // Move to the next divisor
            divisor++;
        } while (divisor <= Math.sqrt(num));

        return true; // It's a prime number if no divisors were found
    }
}
