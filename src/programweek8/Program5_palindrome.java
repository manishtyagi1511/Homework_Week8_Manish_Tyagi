package programweek8;

import java.util.Scanner;

public class Program5_palindrome {
    /**
     * 5. Palindrome Number
     *
     *
     */

    public static boolean isPalindrome(int number){
        int originalNumber=number;
        int reverse=0;

        while (number!=0){
            int lastDigit=number % 10;
            reverse =reverse *10 +lastDigit;
            number/=10;
        }
        return originalNumber==reverse;
    }

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the number");
        int number=obj.nextInt();
        if (isPalindrome(number)) {
            System.out.println(number + " is a palindrome number");
        } else {
            System.out.println(number+ " is not a palindrome number");
        }


    }
}
