import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int count = 0;
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (number % i == 0) {
                count += 1;
            }
        }
        if (count == 0){
            System.out.println("Число простое");
        }else{
            System.out.println("Число не простое");
        }
    }
}
