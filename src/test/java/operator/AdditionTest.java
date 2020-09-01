package operator;

import org.junit.Assert;
import org.junit.Test;

public class AdditionTest {

    @Test
    public void testPerformOperation() {
        Addition addition = new Addition();
        Double actual = addition.performOperation(5D, 2D);
        double expected = 7D;

        Assert.assertEquals(expected, actual, 0);
    }

}
