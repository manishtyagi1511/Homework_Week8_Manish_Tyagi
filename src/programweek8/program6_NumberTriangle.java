package programweek8;

import java.util.Scanner;

public class program6_NumberTriangle {

    /**
     *
     * Write a program in Java to display the pattern like a triangle with a number.
     * For eg.
     * Input number of rows: 10
     * Expected Output:
     * 1
     * 12
     * 123
     * 1234
     * 12345
     * 123456
     * 1234567
     * 12345678
     * 123456789
     * 12345678910
     */

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number rows");
        int row = obj.nextInt();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }

}
