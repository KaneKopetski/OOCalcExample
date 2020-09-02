import operator.Operator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class CalculatorUtilTest {

    @Test
    public void testSetup() {
        CalculatorUtil calculatorUtil = new CalculatorUtil();
        Map<String, Operator> operators = calculatorUtil.setup();
        Operator actual = operators.get("+");

        Assert.assertNotNull(actual);
    }

    @Test
    public void testHandleOperation() {
        CalculatorUtil calculatorUtil = new CalculatorUtil();
        String[] expression = { "2", "+", "2" };
        Double actual = calculatorUtil.handleOperation(expression);
        double expected = 4D;

        Assert.assertEquals(expected, actual, 0);
    }

}
