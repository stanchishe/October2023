import java.lang.reflect.Array;

public class ForEachLoopExample {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "Ford", "Mazda", "Skoda"};
        int carsLength = cars.length;
        System.out.println(carsLength);
        int i = 0;
        for (; i < carsLength;) {
            System.out.println(cars[i]);
            i++;
        }

        for (String carName : cars) {
            System.out.println(carName);
        }
    }
}
