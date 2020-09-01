package operator;

public class Multiplication implements Operator {

    @Override
    public Double performOperation(final Double firstNumberInput, final Double secondNumberInput) {
        return firstNumberInput * secondNumberInput;
    }
}
