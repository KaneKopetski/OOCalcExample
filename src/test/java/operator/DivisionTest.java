package operator;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {

    @Test
    public void testPerformOperation() {
        Division division = new Division();
        Double actual = division.performOperation(5D, 2D);
        double expected = 2.5;

        Assert.assertEquals(expected, actual, 0);
    }
}
