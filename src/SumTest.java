import org.junit.Assert;
import org.junit.Test;

public class SumTest {
    @Test
    public void testSum() {
        int result = Main.sum(10, 20);
        Assert.assertEquals(30, result);
    }
}
