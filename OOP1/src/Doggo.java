public class Doggo {
    public final String subClassOfAnimals = "mammal";
    private final String name;

    public Doggo(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
//    It's invalid, can't change dog names!!!
//    public void setName(String newName) {
//        this.name = newName;
//    }
}

class AppStart {
    public static void main(String[] args) {
        Doggo doggoMax = new Doggo("Max");
        System.out.println(doggoMax.subClassOfAnimals);

        System.out.println(doggoMax.getName());
    }
}
