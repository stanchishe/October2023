public class Doggo {
    public final String subClassOfAnimals = "mammal";
    private final String name;
    private int age;

    public Doggo(String name) {
        this.name = name;
    }

    public Doggo(String name, int age) {
        this(name);
        this.age = age;
    }

    public String getName() {
        return name;
    }
//    It's invalid, can't change dog names!!!
//    public void setName(String newName) {
//        this.name = newName;
//    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) {
            System.out.println("Dogs do not have negative age!");
            return;
        }
        if(age < this.age) {
            System.out.println("Dogs do not age in reverse!");
            return;
        }
        this.age = age;
    }
}

class AppStart {
    public static void main(String[] args) {
        Doggo doggoMax = new Doggo("Max");
        Doggo  doggoJeff = new Doggo("Jeff", 5);

        System.out.println("Doggo Max is: " + doggoMax.subClassOfAnimals);
        System.out.println("Doggo Jeff is: " + doggoJeff.subClassOfAnimals);

        System.out.println("The doggos name is: " + doggoMax.getName());
        System.out.println("The doggos name is: " + doggoJeff.getName());

        System.out.println("The age of " + doggoMax.getName() + " is "  + doggoMax.getAge());
        System.out.println("The age of " + doggoJeff.getName() + " is "  + doggoJeff.getAge());

        doggoJeff.setAge(4);
        doggoMax.setAge(1);
        doggoMax.setAge(0);

        System.out.println("The age of " + doggoMax.getName() + " is "  + doggoMax.getAge());
        System.out.println("The age of " + doggoJeff.getName() + " is "  + doggoJeff.getAge());

        int wantedAge = 3;
        doggoJeff.setAge(wantedAge);
        if (doggoJeff.getAge() != wantedAge) {
            doggoJeff = new Doggo("Jeff", wantedAge);
        }
        System.out.println("The age of " + doggoJeff.getName() + " is "  + doggoJeff.getAge());
    }
}
