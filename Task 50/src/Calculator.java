import java.util.Stack;

public class Calculator {
    public double solve(String expression) {
        Stack<Double> operands = new Stack<>();
        Stack<Character> operations = new Stack<>();

        boolean absOpened = false;
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            if (Character.isDigit(currentChar)) {
                StringBuilder numBuilder = new StringBuilder();
                numBuilder.append(currentChar);
                while (i + 1 < expression.length() && (Character.isDigit(expression.charAt(i + 1)) || expression.charAt(i + 1) =='.')) {
                    numBuilder.append(expression.charAt(++i));
                }
                double number = Double.parseDouble(numBuilder.toString());
                operands.push(number);
            } else if (currentChar == '(') {
                operations.push(currentChar);
            } else if (currentChar == ')') {
                while (!operations.isEmpty() && operations.peek() != '(') {
                    if (operands.isEmpty()) {
                        System.out.println("Внутри скобок нету выражения!");
                        return 0;
                    }
                    char operation = operations.pop();
                    if (operands.isEmpty()) {
                        System.out.println("Ошибка! Отсутствует выражение или неправильно расставлены скобки");
                        return 0;
                    }
                    double operand_2 = operands.pop();
                    if (operands.isEmpty()) {
                        return operand_2;
                    }
                    double operand_1 = operands.pop();
                    double result = execute(operand_1, operand_2, operation);
                    operands.push(result);
                }
                if (!operations.isEmpty() && operations.peek() == '(') {
                    operations.pop();
                } else {
                    System.out.println("Вы неправильно поставили скобки!");
                    return 0;
                }
            } else if (currentChar == '|') {
                if(absOpened) {
                    while (!operations.isEmpty() && getPriority(operations.peek()) <= getPriority('|')) {
                        if (operands.isEmpty()) {
                            System.out.println("Внутри модуля нету выражения!");
                            return 0;
                        }
                        char operation = operations.pop();
                        if (operands.isEmpty()) {
                            System.out.println("Ошибка! Отсутствует выражение");
                            return 0;
                        }
                        double operand_2 = operands.pop();
                          if (operands.isEmpty()) {
                            return Math.abs(operand_2);
                        }
                        double operand_1 = operands.pop();
                        double result = execute(operand_1, operand_2, operation);
                        operands.push(Math.abs(result));
                    }
                    if (!operations.isEmpty() && operations.peek() == '|') {
                        operations.pop();
                    }
                }
                absOpened = !absOpened;
            } else if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/' ||
                    currentChar == '^' || currentChar == '%') {
                while (!operations.isEmpty() && getPriority(operations.peek()) >=
                        getPriority(currentChar)) {
                    char operation = operations.pop();

                    if(operands.isEmpty()){
                        System.out.println("Ошибка! Отсутствует выражение");
                        return 0;
                    }
                    double operand_2 = operands.pop();
                    if(operands.isEmpty()){
                        return operand_2;
                    }
                    double operand_1 = operands.pop();
                    double result = execute(operand_1, operand_2, operation);
                    operands.push(result);
                }
                operations.push(currentChar);
            }
        }
        while (!operations.isEmpty()) {
            char operation = operations.pop();
            if(operands.isEmpty()){
                System.out.println("Ошибка! Отсутствует выражение");
                return 0;
            }
            double operand_2 = operands.pop();
            if(operands.isEmpty()){
                System.out.println("Ошибка! Отсутствует выражение");
                return 0;
            }
            double operand_1 = operands.pop();
            double result = execute(operand_1, operand_2, operation);
            operands.push(result);
        }
        double result = operands.pop();
        History.saveToHistory(expression, result);
        return result;
    }
    private int getPriority(char operation) {
        return switch (operation) {
            case '+', '-' -> 1;
            case '*', '/', '%' -> 2;
            case '^', '|' -> 3;
            default -> 0;
        };
    }

    private double execute(double operand_1, double operand_2, char operation) {
        return switch (operation) {
            case '+' -> operand_1 + operand_2;
            case '-' -> operand_1 - operand_2;
            case '*' -> operand_1 * operand_2;
            case '/' -> operand_1 / operand_2;
            case '%' -> operand_1 % operand_2;
            case '^' -> Math.pow(operand_1, operand_2);
            default -> throw new IllegalArgumentException("Неверный оператор: " + operation);
        };
    }
}