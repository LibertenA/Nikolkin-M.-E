import java.util.Scanner;

public class T13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin_number = scanner.nextInt();
        int step = scanner.nextInt();
        int count = scanner.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println(begin_number);
            begin_number += step;
        }
    }
}
