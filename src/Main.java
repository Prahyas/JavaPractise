public class Main {

    public static void main(String[] args) {
        try {
            Hobbies hobbies = new Hobbies("Prayash", "Coding");
            hobbies.displayName();

            System.out.println(sum(10, 20));
            System.out.println(sum(10, 20, 30));


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


    public static int sum(int a, int b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
}