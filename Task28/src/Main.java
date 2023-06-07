import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        for (int i = number; i < Math.pow(number, 2); i++) {
            int result = i - number;
            if(Math.sqrt(i) - Math.sqrt(result) == 1){
                System.out.println(number + " = " + i + " - " + result);
                count += 1;
                break;
            }
        } if(count != 1){
            System.out.println("Ошибка! Число не является разницей между двумя последовательными квадратами");
        }
    }
}