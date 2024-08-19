import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HobbiesTest {
    public Hobbies hobbies;

    @BeforeEach
    public void setup() {
        hobbies = new Hobbies("Prayash", "Coding");
    }

    @Test
    public void testHobby() {
        Assertions.assertEquals("Prayash", hobbies.getName());
    }


}
