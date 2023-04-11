import java.util.Scanner;

public class T8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int corner;
        if(a + b > c && a + c > b && b + c > a){
            System.out.println("Треугольник существует");
            corner = (int) (Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2))/ (2*b*c);
            corner = 180 - corner;
            System.out.println("Внешний угол:" + corner);
        }else {
            System.out.println("Треугольник не существует");
        }
    }
}
