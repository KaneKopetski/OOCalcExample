import operator.*;

import java.util.HashMap;
import java.util.Map;

public class CalculatorUtil {

    Map<String, Operator> operatorMap = CalculatorUtil.setup();


    public static Map<String, Operator> setup() {

        Map<String, Operator> operatorMap = new HashMap<>();

        Operator addition = new Addition();
        Operator subtraction = new Subtraction();
        Operator multiplication = new Multiplication();
        Operator division = new Division();
        Operator exponent = new Exponent();

        operatorMap.put("+", addition);
        operatorMap.put("-", subtraction);
        operatorMap.put("*", multiplication);
        operatorMap.put("/", division);
        operatorMap.put("^", exponent);

        return operatorMap;
    }

    public void start() {
        String userInput = Console.getStringInput("Enter an arithmetic expression. E.g. 2 + 2. Spaces are important.");
        Double result = this.handleOperation(Console.getExpressionAsArray(userInput));
        System.out.println("Result is: " + result);
        start();
    }

    public Double handleOperation(String[] expression) {
        Operator operator = this.operatorMap.get(expression[1]);
        return operator.performOperation(Double.parseDouble(expression[0]), Double.parseDouble(expression[2]));
    }
}
