import java.util.Stack;

public class Calculator {
    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '|' || c == '%';
    }
    private double executeOperation(double num1, double num2, char operator) {
        return switch (operator) {
            case '+' -> num1 + num2;
            case '-' -> num1 - num2;
            case '*' -> num1 * num2;
            case '/' -> num1 / num2;
            case '%' -> num1 % num2;
            case '^' -> Math.pow(num1, num2);
            default -> throw new IllegalArgumentException("Неверный оператор: " + operator);
        };
    }
    public double evaluateExpression(String expression) {
        Stack<Double> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (Character.isDigit(currentChar)) {
                StringBuilder numBuilder = new StringBuilder();
                numBuilder.append(currentChar);
                while (i + 1 < expression.length() && Character.isDigit(expression.charAt(i + 1))) {
                    numBuilder.append(expression.charAt(i + 1));
                    i++;
                }
                double number = Double.parseDouble(numBuilder.toString());
                numbers.push(number);
            } else if (currentChar == '(') {
                operators.push(currentChar);
            } else if (currentChar == ')') {
                while (!operators.isEmpty() && operators.peek() != '(') {
                    char operator = operators.pop();
                    double num2 = numbers.pop();
                    double num1 = numbers.pop();
                    double result = executeOperation(num1, num2, operator);
                    numbers.push(result);
                }
                if (!operators.isEmpty() && operators.peek() == '(') {
                    operators.pop();
                }
            } else if (isOperator(currentChar)) {
                while (!operators.isEmpty() && getOperatorPriority(operators.peek()) >= getOperatorPriority(currentChar)) {
                    char operator = operators.pop();
                    double num2 = numbers.pop();
                    double num1 = numbers.pop();
                    double result = executeOperation(num1, num2, operator);
                    numbers.push(result);
                }
                operators.push(currentChar);
            }
        }
        while (!operators.isEmpty()) {
            char operator = operators.pop();
            double num2 = numbers.pop();
            double num1 = numbers.pop();
            double result = executeOperation(num1, num2, operator);
            numbers.push(result);
        }
        return numbers.pop();
    }
    private int getOperatorPriority(char operator) {
        return switch (operator) {
            case '+', '-' -> 1;
            case '*', '/', '%' -> 2;
            case '^', '|' -> 3;
            default -> 0;
        };
    }
}