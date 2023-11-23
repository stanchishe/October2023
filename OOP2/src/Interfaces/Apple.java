package Interfaces;

import java.util.ArrayList;
import java.util.Collections;

public class Apple implements Comparable<Apple> {
    private String variety;
    private String color;
    private int weigh;

    public Apple (String variety, String color, int weigh) {
        this.variety = variety;
        this.color = color;
        this.weigh = weigh;
    }

    public String getVariety() {
        return variety;
    }

    public String getColor() {
        return color;
    }

    public int getWeigh() {
        return weigh;
    }

    @Override
    public int compareTo(Apple another) {
        int result = Integer.compare(another.weigh, this.weigh);
        if (result == 0) result = this.color.compareTo(another.color);
        if (result == 0) result = this.variety.compareTo(another.variety);
        return result;
    }
}

class AppleStart {
    public static void main(String[] args) {
        ArrayList<Integer> intArrList = new ArrayList<>();
        Collections.addAll(intArrList, 5, 25, 3, 8, 15, 23, 45, 99, 98);

        System.out.println("First state of the int List is");
        for (Integer integer : intArrList) {
            System.out.println(integer);
        }

        Collections.sort(intArrList);
        System.out.println("Second state of the int List is");
        for (Integer integer : intArrList) {
            System.out.println(integer);
        }

        ArrayList<Apple> applesArrayList = new ArrayList<>();

        Apple appleOne = new Apple("Sweet Tango", "Red", 157);
        Apple appleTwo = new Apple("Gala", "Red", 168);
        Apple appleThree = new Apple("Pazazz", "Red and Yellow", 163);
        Apple appleFour = new Apple("Granny Smith", "Green", 151);
        Apple appleFive = new Apple("Golden", "Yellow", 151);

        Collections.addAll(applesArrayList, appleOne, appleTwo, appleThree, appleFour, appleFive);
        System.out.println("First state of the apples List is");
        for (Apple apple : applesArrayList) {
            System.out.println(apple.getVariety() + " " + apple.getColor() + " " + apple.getWeigh());
        }

        Collections.sort(applesArrayList);
        System.out.println("Second state of the apples List is");
        for (Apple apple : applesArrayList) {
            System.out.println(apple.getVariety() + " " + apple.getColor() + " " + apple.getWeigh());
        }
    }
}
