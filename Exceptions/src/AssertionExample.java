import java.util.Scanner;

public class AssertionExample {
    public static void main(String[] args) {
        System.out.println("Enter your age:");
        Scanner scanner = new Scanner(System.in);

        int age = scanner.nextInt();

        // Compile the code and run with java -enableassertions AssertionExample to use assertions
        assert (age >= 18);

        System.out.println("You are of legal age!");
    }
}
