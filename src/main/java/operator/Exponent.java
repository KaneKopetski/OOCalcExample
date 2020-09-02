package operator;

public class Exponent implements Operator {

    @Override
    public Double performOperation(final String[] expression) {
        return Math.pow(Double.parseDouble(expression[0]), Double.parseDouble(expression[2]));
    }
}
