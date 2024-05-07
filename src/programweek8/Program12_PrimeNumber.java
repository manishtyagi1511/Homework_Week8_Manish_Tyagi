package programweek8;

import java.util.Scanner;

public class Program12_PrimeNumber {
    /**
     *12. Write a programme to input any number and check if it is prime or not.
     * (Prime number is a number that is greater than 1 and divided by 1 or itself only. In other words,
     * prime numbers can't be divided by other numbers than itself or 1. For example 2, 3, 5, 7, 11, 13,
     * 17.... are the prime numbers.)
     *
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number:");

        int number1=scanner.nextInt();


        if (primeNumber(number1)) {
            System.out.println(number1 + " is a prime number");
        } else {
            System.out.println(number1 + " is not a prime number");
        }

    }

    public static boolean primeNumber(int number){
        if (number <=1){
            return false;


        } for (int i=2; i<=Math.sqrt(number); i++){
            if (number % i==0)
                {  return false; }

        }
        return true;


    }
}
