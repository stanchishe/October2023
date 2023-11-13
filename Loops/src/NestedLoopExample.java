public class NestedLoopExample {
    public static void main(String[] args) {
        int numAps = 7;
        int numFlo = 5;

        for(int i = 1; i <= numFlo; i++) {
            for (int j = 1; j <= numAps; j++ ) {
                System.out.println("We are in apartment " + j + " on floor number " + i);
            }
        }
    }
}
