package programweek8;

import java.util.Scanner;

public class Program2_MinAndMaxInputChallenge {
    /**
     *
     * 2. -Read the numbers from the console entered by the user and print the minimum
     * and maximum number the user has entered.
     * -Before the user enters the number, print the message Enter number:
     * -If the user enters an invalid number, break out of the loop and print the minimum and maximum
     * number.
     * Hint:
     * -Use an endless while loop.
     * -Create a class with the name MinAndMaxInputChallenge.
     */



    public static void main(String[] args) {
        findMinMax();
    }

    public static void findMinMax() {
        Scanner scanner = new Scanner(System.in);

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        while (true) {
            System.out.print("Enter number: ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                // Update min and max values
                min = Math.min(min, number);
                max = Math.max(max, number);
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Clear the invalid input
                continue;
            }

            System.out.print("Do you want to enter another number? (yes/no): ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }

        System.out.println("Minimum number entered: " + min);
        System.out.println("Maximum number entered: " + max);

        scanner.close();
    }
}








