import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(">Введите выражение или выберите команду: " + '\n' + "1.История" + '\n' + "2.Очистить историю" + '\n' + "3.Выход");
            //System.out.println("");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("выход")) {
                break;
            } else if(input.equalsIgnoreCase("история")){
                List<String> history = History.loadHistory();
                System.out.println("История вычислений:");
                for (String entry : history) {
                    System.out.println(entry);
                }
            }else if(input.equalsIgnoreCase("Очистить")) {
                History.deleteHistory();
            }else {
                double result = calculator.solve(input);
                System.out.println("Результат: " + result);
            }
        }
    }
}