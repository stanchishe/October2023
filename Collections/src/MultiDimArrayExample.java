public class MultiDimArrayExample {
    public static void main(String[] args) {
        int[][] twoDimArr = {
                {2, 4, 8, 16},
                {3, 6, 12, 24, 48},
                {5, 10, 20, 40, 80, 160},
        };

        System.out.println(twoDimArr.length);
        System.out.println(twoDimArr[0].length);

        System.out.println("------------------");

        for (int i = 0; i < twoDimArr.length; i++) {
            for (int j = 0; j < twoDimArr[i].length; j++) {
                System.out.println(twoDimArr[i][j]);
            }
        }
    }
}
