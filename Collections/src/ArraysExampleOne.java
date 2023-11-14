public class ArraysExampleOne {
    public static void main(String[] args) {
        String[] cars = {"Lada", "BMW", "FORD", "Skoda"};
        System.out.println(cars[0]);
        cars[3] = "Opel";
        System.out.println(cars[3]);

        int[] numbers = new int[10];
        System.out.println(numbers.length);
        System.out.println(numbers[1]);

        numbers[1] = 500;
        System.out.println(numbers[1]);

        for(int i = 0; i < numbers.length; i++) {
            int newValue = (int) Math.pow(i, i);
            numbers[i] = newValue;

        }
        System.out.println(numbers[9]);

        int[] numbersDuplicate = new int[numbers.length];
        for (int i = 0; i < numbersDuplicate.length; i++) {
            numbersDuplicate[i] = numbers[i];
        }
        System.out.println(numbersDuplicate[9]);
        System.out.println(numbersDuplicate.length);
    }
}
