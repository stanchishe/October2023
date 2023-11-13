public class ComparisonOps {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        boolean comparison = a == b;

        System.out.println(comparison);

        b += 3;
        System.out.println(a != b);
        System.out.println(b);
        b -= 50;
        System.out.println(b);
    }
}
