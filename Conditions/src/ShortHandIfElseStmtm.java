import java.util.Scanner;

public class ShortHandIfElseStmtm {
    public static void main(String[] args) {
        // Creates an input tracker, to watch for input from the command line
        Scanner input = new Scanner(System.in);

        // Get inputs from the user
        System.out.println("Enter the number!");
        int a = input.nextInt();

        // (condition) ? true condition : false condition;

        // We accept zero as an even number here!
        int remainder = a % 2;
        String result = (remainder == 0) ? "The number is even!" : "The number is odd!";
        System.out.println(result);

        if (remainder == 0) {
            System.out.println("The number is even!");
        } else {
            System.out.println("The number is odd!");
        }
    }
}
