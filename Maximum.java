/*@Karen Sandoval */
// Karen Sandoval and Julius Renteria //
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 3 numbers to find the max!");
        System.out.println("Enter first number:");
        int number1 = input.nextInt();
        System.out.println("Enter second number:");
        int number2 = input.nextInt();
        System.out.println("Enter the last number:");
        int number3 = input.nextInt();
        int max;
        // User's inputs //

        if (number1 >= number2) {
            max = number1;
        } else
            max = number2;

        if (number1 >= number3) {
            max = number1;
        } else
            max = number3;

        if (number2 >= number3) {
            max = number2;
        } else
            max = number3;


        System.out.println("This is the max of the numbers you entered:" + max);
        // Max output //
    }
}