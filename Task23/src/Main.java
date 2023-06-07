import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        int number_3 = scanner.nextInt();
        int count = 0;
        for (int i = 1; i < number_1; i++) {
            if(i % number_2 == 0 || i % number_3 == 0){
                count += i;
            }
        }
        System.out.println(count);
    }
}