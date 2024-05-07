package programweek8;

import java.util.Scanner;

public class Program8_RightAngelTriangle {
    /**
     * Display right angle triangle of @ using nested for loops
     *
     * @
     * @@
     * @@@
     * @@@@
     * @@@@@
     */

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = obj.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("@");

            }
            System.out.println();
        }
    }
}