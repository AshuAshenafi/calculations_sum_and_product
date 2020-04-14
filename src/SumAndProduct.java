import java.util.Scanner;

public class SumAndProduct {
    public static void main(String[] args) {

        int num1;
        int num2;
        int nums_sum;
        int nums_product;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        num1 = input.nextInt();

        System.out.println("Enter another number: ");
        num2 = input.nextInt();

        nums_sum = num1 + num2;
        nums_product = num1 * num2;

        System.out.println("Sum : " + nums_sum);
        System.out.println("Product : " + nums_product);
    }

}
