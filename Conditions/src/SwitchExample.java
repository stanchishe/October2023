import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        final int gold = 1;
        final int silver = 2;
        final int bronze = 3;
        int result;

        if (args.length < 1) {
            // If no CLI arguments, use the Scanner:
            Scanner input = new Scanner(System.in);
            System.out.println("Enter your race place:");
            result = input.nextInt();
            input.close();
        } else {
            // Read from the args array
            // Parse the string into an integer
            result = Integer.parseInt(args[0]);
        }

        String medal = "";
        switch (result) {
            case gold:
                medal = "Gold!";
                break;
            case silver:
                medal = "Silver!";
                break;
            case bronze:
                medal = "Bronze!";
                break;
            default:
                System.out.println("Better luck next time!");
        }
        System.out.println("Your medal is: " + medal);
    }
}
// ["3"]