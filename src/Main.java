import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        try {

            List<Integer> names = new ArrayList<>();

            names.add(10);
            names.add(20);
            names.add(30);

            int filteredNames = names.stream().reduce(0, (a, b) -> a + b);

            System.out.println(filteredNames);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}