public class StringComparisonExample {
    public static void main(String[] args) {
        String nameOne = "Mark";
        String nameTwo = new String("mARK");
        // ==
        if(nameOne.equalsIgnoreCase(nameTwo)) System.out.println("The two names are identical!");
        else System.out.println("The two names are different!");
    }
}
