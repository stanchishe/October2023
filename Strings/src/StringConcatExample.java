public class StringConcatExample {
    public static void main(String[] args) {
        String firstPart = "My favorite beer is";
        String secondPart = "the German one!";

        String resultOne = firstPart + " " + secondPart;
        String resultTwo = firstPart.concat(" ").concat(secondPart);

        System.out.println("Result one:");
        System.out.println(resultOne);

        System.out.println("Result two:");
        System.out.println(resultTwo);
    }
}
