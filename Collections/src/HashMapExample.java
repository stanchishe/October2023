import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> peopleAges = new HashMap<>();

        peopleAges.put("Mark", 29);
        peopleAges.put("Steve", 48);
        peopleAges.put("Anne", 31);

        System.out.println(peopleAges);

        System.out.println(peopleAges.get("Mark"));
        System.out.println(peopleAges.containsKey("Steve"));
        System.out.println(peopleAges.containsValue(54));

        peopleAges.replace("Jeff", 30);
        System.out.println(peopleAges);

        peopleAges.replace("Steve", 49);
        System.out.println(peopleAges.get("Steve"));
        System.out.println(peopleAges);

        peopleAges.putIfAbsent("Mark", 12);
        System.out.println(peopleAges.get("Mark"));

        peopleAges.putIfAbsent("Kirk", 72);
        System.out.println(peopleAges);
        System.out.println(peopleAges.get("Kirk"));

        peopleAges.remove("Kirk");
        System.out.println(peopleAges);
    }
}
