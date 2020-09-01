package operator;

import org.junit.Assert;
import org.junit.Test;

public class MultiplicationTest {

    @Test
    public void testPerformOperation() {
        Multiplication multiplication = new Multiplication();
        Double actual = multiplication.performOperation(5D, 2D);
        double expected = 10D;

        Assert.assertEquals(expected, actual, 0);
    }
}
