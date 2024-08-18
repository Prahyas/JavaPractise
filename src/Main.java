public class Main {


    public static void main(String[] args) {
        try {
            Person person = new Person();
            person.name = "Prayash";
            changeName(person);
            System.out.println(person.name);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    static void changeName(Person person) {
        person.name = "Ashmita";
    }

}