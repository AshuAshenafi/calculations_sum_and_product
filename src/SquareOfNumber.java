import java.util.Scanner;

public class SquareOfNumber {
    public static void main(String[] args) {

        int num1;
        int sqr_of_num1;

        Scanner input = new Scanner(System.in);

        System.out.print("Input: ");
        num1 = input.nextInt();

        sqr_of_num1 = num1 * num1;

        System.out.println("Output : " + sqr_of_num1);

    }
}
