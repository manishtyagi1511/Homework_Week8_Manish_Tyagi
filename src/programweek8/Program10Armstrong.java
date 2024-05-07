package programweek8;

import java.util.Scanner;

public class Program10Armstrong {
    /**
     *
     * 10. Write a program to input any number and check if it Armstrong number or not
     * 153 = (1*1*1)+(5*5*5)+(3*3*3)
     * where:
     * (1*1*1)=1
     * (5*5*5)=125
     * (3*3*3)=27
     * So:
     * 1+125+27=153
     */

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = obj.nextInt();
        if (armstrong(num)){
            System.out.println(num+ " is an armstrong number");
        }else {
            System.out.println(num+ " is not an armstrong number");
        armstrong(num);    //calling boolean method into the main method

        }

    }

    public static boolean armstrong(int num) {
        int originalNumber=num;
        int sum=0;
        while (num > 0) {
            int digit=num %10;
            sum += Math.pow(digit,3);
            num/=10;

        }
        return sum==originalNumber;



    }

}
