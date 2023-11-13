public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 5;

        while (i < 5) {
            System.out.println("Hello, World!");
            i++;
        }
        System.out.println("After the while loop, i is: " + i);

        do {
            System.out.println("Hello, World!");
            i++;
        } while (i < 5);
        System.out.println("After the do-while loop, i is: " + i);
    }
}
