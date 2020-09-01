import org.junit.Assert;
import org.junit.Test;

public class ConsoleTest {

    @Test
    public void testGetExpressionAsArray() {
        String[] actual = Console.getExpressionAsArray("2 + 2");
        String expected = "2";

        Assert.assertEquals(expected, actual[0]);

    }

}
