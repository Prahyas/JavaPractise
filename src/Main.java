public class Main {


    public static void main(String[] args) {
        try {

            int[][] arr1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};


            int[][] result = {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}};

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    result[j][i] = arr1[i][j];
                }
            }

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    System.out.println(result[i][j]);
                }
            }


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}