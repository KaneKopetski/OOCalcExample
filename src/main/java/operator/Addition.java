package operator;

public class Addition implements Operator {

    @Override
    public Double performOperation(final String[] expression) {
        return Double.parseDouble(expression[0]) + Double.parseDouble(expression[2]);
    }

}
