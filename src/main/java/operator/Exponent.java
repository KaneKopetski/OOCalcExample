package operator;

public class Exponent implements Operator {

    @Override
    public Double performOperation(final Double firstNumberInput, final Double secondNumberInput) {
        return Math.pow(firstNumberInput, secondNumberInput);
    }
}
