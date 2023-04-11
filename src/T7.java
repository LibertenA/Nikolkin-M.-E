import java.util.Scanner;

public class T7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        System.out.print(Math.round(Math.sqrt(number)));
    }
}
