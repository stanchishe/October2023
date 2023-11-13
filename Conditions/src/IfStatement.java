import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        // Creates an input tracker, to watch for input from the command line
        Scanner input = new Scanner(System.in);

        // Get inputs from the user
        System.out.println("Enter the first number!");
        int a = input.nextInt();

        System.out.println("Enter the second number!");
        int b = input.nextInt();

        if (a > b) {
            System.out.println("a is a bigger number than b");
        }
        System.out.println("We are done!");
    }
}
