import operator.Operator;
import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class OperatorTests {
    
    private final String[] additionExpression = {"2", "+", "2"};
    private final String[] subtractionExpression = {"2", "-", "2"};
    private final String[] multiplicationExpression = {"2", "*", "2"};
    private final String[] divisionExpression = {"2", "/", "2"};
    private final String[] exponentExpression = {"2", "^", "2"};
    private final String[] tangentExpression = {"trig", "tan", "0"};
    private final CalculatorUtil calculatorUtil = new CalculatorUtil();

    @Test
    public void testAddition() {
        Double actual = calculatorUtil.handleOperation(this.additionExpression);
        Double expected = 4D;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSubtraction() {
        Double actual = calculatorUtil.handleOperation(this.subtractionExpression);
        Double expected = 0D;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testMultiplication() {
        Double actual = calculatorUtil.handleOperation(this.multiplicationExpression);
        Double expected = 4D;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testDivision() {
        Double actual = calculatorUtil.handleOperation(this.divisionExpression);
        Double expected = 1D;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testExponent() {
        Double actual = calculatorUtil.handleOperation(this.exponentExpression);
        Double expected = 4D;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTangent() {
        Double actual = calculatorUtil.handleOperation(this.tangentExpression);
        Double expected = 0D;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setupTest() {
        Map<String, Operator> operatorsMap = this.calculatorUtil.setup();

        Assert.assertNotNull(operatorsMap);
    }

    @Test
    public void getOperatorTest() {
        Operator operator = this.calculatorUtil.getOperator("+");
        Double actual = operator.performOperation(this.additionExpression);
        Double expected = 4D;
        Assert.assertEquals(actual, expected);
    }
    
    
}
