import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        try {
            String currentPath = System.getProperty("user.div");
            File file = new File(currentPath, "src/logs.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                String input = scanner.nextLine();
                System.out.println(input);
            }
            scanner.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

}