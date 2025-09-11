
/**
 * @author Karen Sandoval
 * Displays the maximum of a set of three numbers input by the user
 */
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
        
        int max = number1;
        if (number2 > max) {
            max = number2;
        }
        if (number3 > max) {
            max = number3;
        }
        // User's inputs //

        /*if (number1 >= number2) {
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
            max = number3;*/

        
        


        System.out.println("This is the max of the numbers you entered:" + max);
        // Max output //
    }
}