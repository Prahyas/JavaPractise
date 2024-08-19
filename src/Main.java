public class Main {

    public static void main(String[] args) {
        try {

            int result = sum(10, 20);
            System.out.println(result);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public static int sum(int a, int b) {
        return a + b;
    }
}