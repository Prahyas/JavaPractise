public class Main {

    public static int sum(int[][] arr) {
        int sumi = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                sumi = sumi + arr[i][j];
            }
        }
        return sumi;
    }

    public static void main(String[] args) {
        Honda honda = new Honda("Honda CRV", 4);
        honda.displayCar();
        
    }
}