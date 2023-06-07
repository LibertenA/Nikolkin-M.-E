public class Main {
    public static void main(String[] args) {
        System.out.println(FuscCalculator.fusc(0));
        System.out.println(FuscCalculator.fusc(1));
        System.out.println(FuscCalculator.fusc(2));
        System.out.println(FuscCalculator.fusc(3));
    }
}

class FuscCalculator {
    public static int fusc(int n) {
        int a = 0;
        int b = 1;

        if (n == 0) {
            return a;
        }

        if (n == 1 || n == 2) {
            return b;
        }

        while (n > 2) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n - 1;
                int temp = a;
                a = a + b;
                b = temp;
            }
        }

        return a + b;
    }
}