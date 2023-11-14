import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        set.add("John");
        set.add("Jeff");
        set.add("Adam");
        set.add("Anne");
        set.add("John");
        set.add("Maria");
        set.add("John");
        set.add("Kate");

        // Records are unique

        System.out.println(set);
        System.out.println(set.size());

        // Not possible: set.sort()

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }

        set.remove("John");
        System.out.println(set);

        if(set.contains("Maria")) {
            System.out.println("We found Maria!");
        }
    }
}
