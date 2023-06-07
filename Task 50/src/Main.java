import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        History historyManager = new History();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите математическое выражение: ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("выход")) {
                break;
            }
            double result = calculator.evaluateExpression(input);
            System.out.println("Результат: " + result);
            historyManager.saveExpression(input, result);
        }
        List<String> history = historyManager.loadHistory();
        System.out.println("История вычислений:");
        for (String entry : history) {
            System.out.println(entry);
        }
    }
}