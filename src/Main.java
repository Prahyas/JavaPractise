import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        try {

            LocalDate today = LocalDate.now();
            System.out.println(today.getMonth());


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }


}