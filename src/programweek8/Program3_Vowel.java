package programweek8;

import java.util.Scanner;

public class Program3_Vowel {
    /**
     * Write a Java program that takes the user to provide a single character from the
     * alphabet. Print Vowel of Consonant, depending on the user input. If the user input
     * Is not a letter (between a and z or A and Z), or is a string of length > 1, print an
     * error message.
     * For eg:
     * Input an alphabet: p
     * Expected Output:
     * Input letter is Consonant
     */

    public static void main(String[] args) {
        int i=0;   // we need to declare this variable because we are taking char data type
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a character");
        char c =obj.next().charAt(0);

        if (c=='a' ||c =='e' || c =='i' || c == 'o' || c=='u' ||c=='A'  || c=='E' ||c=='I' || c =='O' || c=='U') {
            System.out.println("Entered character" +c+ "is Vowel");
        } else if ((c>='a' && c<='z') ||(c>='A' && c<='Z')) {
            System.out.println("Entered character" + c + "is Consonant");
        } else{
            System.out.println("Not an alphabet");




        }

    }


}
