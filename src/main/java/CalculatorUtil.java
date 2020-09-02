import operator.*;

import java.util.HashMap;
import java.util.Map;

public class CalculatorUtil {

    private final Map<String, Operator> operatorMap = this.setup();

    public Map<String, Operator> setup() {

        Map<String, Operator> operatorMap = new HashMap<>();

        Operator addition = new Addition();
        Operator subtraction = new Subtraction();
        Operator multiplication = new Multiplication();
        Operator division = new Division();
        Operator exponent = new Exponent();
        Operator tangent = new Tangent();

        operatorMap.put("+", addition);
        operatorMap.put("-", subtraction);
        operatorMap.put("*", multiplication);
        operatorMap.put("/", division);
        operatorMap.put("^", exponent);
        operatorMap.put("tan", tangent);

        return operatorMap;

    }

    public void start() {
        String userInput = Console.getStringInput("Enter a math expression. E.g. 2 + 2 or trig tan 2. Spaces are important.");
        Double result = this.handleOperation(Console.getExpressionAsArray(userInput));
        System.out.println("Result is: " + result);
        start();
    }

    public Double handleOperation(String[] expression) {
        return this.getOperator(expression[1]).performOperation(expression);

    }

    public Operator getOperator(String key) {
        return this.operatorMap.get(key);
    }
}
