package programweek8;

import java.util.Scanner;

public class Program15_LeftAngelTriangle {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = obj.nextInt();
        leftAngelTriangle(number);
    }

    public static void leftAngelTriangle(int number) {

        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
        }
            System.out.println();
    }

}
    }

