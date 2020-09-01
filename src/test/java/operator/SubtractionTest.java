package operator;

import org.junit.Assert;
import org.junit.Test;

public class SubtractionTest {

    @Test
    public void testPerformOperation() {
        Subtraction subtraction = new Subtraction();
        Double actual = subtraction.performOperation(5D, 2D);
        double expected = 3D;

        Assert.assertEquals(expected, actual, 0);
    }
}
