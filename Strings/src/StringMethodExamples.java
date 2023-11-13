import java.util.Arrays;

public class StringMethodExamples {
    public static void main(String[] args) {
        String stringExample = "I am an Englishman in New York";

        // Get the length of the String
        System.out.println(stringExample.length());

        System.out.println(stringExample.indexOf("an"));

        System.out.println(stringExample.startsWith("I am"));
        System.out.println(stringExample.contains("an"));
        System.out.println(stringExample.endsWith("New York"));

        System.out.println(stringExample.substring(8));
        System.out.println(stringExample.substring(8, 13));

        String emptyString = "";
        String stringOfSpaces = "    ";

        System.out.println(stringExample.isEmpty());
        System.out.println(emptyString.isEmpty());
        System.out.println(stringOfSpaces.isEmpty());
        System.out.println(stringOfSpaces.isBlank());

        String newString = stringExample.replace("an", "bleh");
        System.out.println(newString);

        String[] splitExample = stringExample.split(" ");
        System.out.println(Arrays.toString(splitExample));

        String myName = "Mark";
        String formatString = String.format("My name is %s ! I live in Prague!", myName);

        System.out.println(formatString);
        System.out.println(String.format("%2.3f", 12.1234));
        System.out.println(String.format("%4.5f", 12.1234));

        String someOtherString = "The name of the author is \"J.R.R. Tolkein\".";
        System.out.println(someOtherString);
    }
}
