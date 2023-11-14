import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class ArrayListExample {
    public static void main(String[] args) {
        // Array list to store Strings
        ArrayList<String> listOne = new ArrayList<>();

        // Array list for any kind of objects
        ArrayList listTwo = new ArrayList();

        listOne.add("John");
        listOne.add("Jeff");
        listOne.add("Anna");
        listOne.add("Mark");
        listOne.add("Jim");
        listOne.add("Kirk");

        // Error: listOne.add(10);

        listTwo.add("Dave");
        listTwo.add(5);
        listTwo.add(2.7);
        listTwo.add("Dave2");
        listTwo.add("Dave3");
        Student Mark = new Student("Mark", 25);
        listTwo.add(Mark);

        System.out.println(listOne);
        System.out.println(listTwo);

        // Get the element in index 1
        System.out.println(listOne.get(1));

        System.out.println("Add Zach before Jeff:");
        listOne.add(1, "Zach");
        System.out.println(listOne.get(1));
        System.out.println(listOne);

        System.out.println("Replace Jeff with Oliver");
        listOne.set(2, "Oliver");
        System.out.println(listOne);

        System.out.println("Remove Oliver");
        listOne.remove(2);
        System.out.println(listOne);

        if(listOne.contains("Jim")) {
           System.out.println("We found Jim!");
        }

        // Clear all elements in the list: listOne.clear();

        System.out.println("Iterate using a classic for loop");
        for (int i = 0; i < listOne.size(); i++) {
            System.out.println(listOne.get(i));
        }

        System.out.println("Iterate with a while loop");
        Iterator<String> iterator = listOne.iterator();

        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
            if(str.equals("Kirk")) {
                iterator.remove();
            }
        }
        System.out.println(listOne);

        String listOneStrOne = listOne.get(0);
        System.out.println(listOneStrOne);

        // Basic polymorphism example:
        Object listTwoObjOne = listTwo.get(0);
        System.out.println(listTwoObjOne);

        // Find the index of Zach
        System.out.println(listOne.indexOf("Zach"));
    }
}

class Student {
    public String name;
    public int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;

    }
}