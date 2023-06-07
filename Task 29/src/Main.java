import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Math.abs(scanner.nextInt());
        int begin_range = scanner.nextInt();
        int sum = 0;
        int result = number * begin_range;
        String str = Integer.toString(number);
        for (int i = 0; i < str.length(); i++) {
            int s = Integer.parseInt(String.valueOf(str.charAt(i)));
            sum += Math.pow(s, begin_range);
            begin_range += 1;
        } if (sum == result){
            System.out.println("True");
        } else{
            System.out.println("False");
        }
    }
}