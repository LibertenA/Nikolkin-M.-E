import java.util.Scanner;

public class T12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number_1 = scanner.nextInt();
        int number_2 = scanner.nextInt();
        if(number_1 > number_2){
            int con = number_2;
            while (number_2 <= number_1){
                System.out.println(Math.pow(number_2, 2));
                number_2 += con;
            }
        }else {
            int con = number_1;
            while (number_1 <= number_2) {
                System.out.println(Math.pow(number_1, 2));
                number_1 += con;
            }
        }
    }
}
