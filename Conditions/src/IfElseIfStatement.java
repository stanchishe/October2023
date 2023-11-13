import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args) {
        // Creates an input tracker, to watch for input from the command line
        Scanner input = new Scanner(System.in);

        // Get inputs from the user
        System.out.println("Enter the number!");
        int a = input.nextInt();

        // Calculate remainder
        int remainder = a % 2;

        // Check if the number supplied in a is odd or even
        if(a == 0) {
            System.out.println("The provided number is Zero!");
            System.out.println("The provided number is Zero!");
            System.out.println("The provided number is Zero!");
            System.out.println("The provided number is Zero!");
            System.out.println("The provided number is Zero!");
            System.out.println("The provided number is Zero!");
        } else if (remainder == 0) {
            System.out.println("The provided number is even!");
        } else if (remainder == 1) {
            System.out.println("The provided number is odd!");
        } else {
            System.out.println("This is a mathematical impossibility!");
        }
        System.out.println("We are done!");
    }
}
