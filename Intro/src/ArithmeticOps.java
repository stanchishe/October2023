public class ArithmeticOps {
    public static void main(String[] args) {
        int a = 5;
        Integer b = new Integer(4);
        int c = b % a;

        System.out.println("The modulo of " + b + " divided by " + a + " is: " + c);

        System.out.println("The increment of c is: " + ++c);
        System.out.println("The decrement of c is: " + --c);
    }
}
