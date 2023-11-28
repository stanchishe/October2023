import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        try {
            System.out.println("Provide the number to divide:");
            a = scanner.nextInt();
            System.out.println("Provide the number to divide by:");
            b = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input detected!!!");
            return;
        } finally {
            scanner.close();
        }

        if (b == 0) {
            System.out.println("Cannot divide by Zero! \nExiting...");
            return;
        }
        double result = a / b;

//        Not necessary, exception is avoided with correct condition
//        try {
//            result = a/b;
//        } catch (ArithmeticException e) {
//            System.out.println("Division was not possible, because: " + e.getMessage());
//            return;
//        }
        System.out.println(result);
    }
}
