package operator;

public class Tangent implements Operator {

    @Override
    public Double performOperation(final String[] expression) {
        return Math.tan(Double.parseDouble(expression[2]));
    }
}
