public class MethodOverload {
    public static void main(String[] args) {
        int sumOne = sum(5, 9);
        System.out.println(sumOne);

        double sumTwo = sum(5.2, 7.5);
        System.out.println(sumTwo);

        // double sumThree = sum(5.3, 10.1, 11.6);
        System.out.println(sum(5.3, 10.1, 11.6));
    }

    public static int sum(int a, int b) {
        return  a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }
}
