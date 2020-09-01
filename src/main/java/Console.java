import java.util.Scanner;

public class Console {

    private static final Scanner scanner = new Scanner(System.in);

    public static String getStringInput(String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public static String[] getExpressionAsArray(String expression) {
        return expression.split(" ");
    }

}
