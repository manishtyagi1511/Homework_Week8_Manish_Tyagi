package programweek8;

import java.util.Scanner;

public class Program9_Fibonacci {
    /**
     *
     * 9. Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
     */

    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number");
        int num=obj.nextInt();
        fibo(num);
    }

    public static void fibo(int num) {

        int first = 1;
        int second = 1;

       System.out.print(first + " " + second+ " ");

       for (int i=3; i<=num; i++)
       {
           int next=first+second;
           System.out.print(next +" ");
           first=second;
           second=next;
       }


    }
}
