import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number?");
        String a = scanner.nextLine();
        System.out.println("Enter second number?");
        String b = scanner.nextLine();

        int sum = Integer.parseInt(a) + Integer.parseInt(b);
        int product = Integer.parseInt(a) * Integer.parseInt(b);

        float test = Float.parseFloat(sum + Integer.toString(product));

        System.out.println(sum);
        System.out.println(product);
        System.out.println(test);
    }
}