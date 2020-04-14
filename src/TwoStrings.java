/*
    Get two different string input from user and print them in the same line
     */

import java.util.Scanner;

public class TwoStrings {
    public static void main(String[] args) {
        String input1;
        String input2;

        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        input1 = input.nextLine();

        System.out.print("Input: ");
        input2 = input.nextLine();


         System.out.println("Output : " + input1 + " " + input2);
    }

}
