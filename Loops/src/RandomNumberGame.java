import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class RandomNumberGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt((15 - 1) + 1) + 1;
        int numberOfGuesses = 0;
        while (true) {
            System.out.println("I'm thinking of a number between 1 and 15. Try to guess it!");
            int guessedNumber = input.nextInt();
            numberOfGuesses++;
            if(randomNumber == guessedNumber) {
                System.out.println("You guessed right! The number was: " + randomNumber);
                break;
            }
            System.out.println("WRONG! Do you want to try again?");
            String userAnswer = input.next().toLowerCase();
            boolean tryAgain = userAnswer.equals("yes");
            if(!tryAgain) {
                System.out.println("Better luck next time, the number was: " + randomNumber);
            }
            if (numberOfGuesses > 5) {
                System.out.println("You ran out of attempts!");
                break;
            }
        }
        System.out.println("You made " + numberOfGuesses + " attempts!");
        input.close();
    }
}
