public class Main {
    public static void main(String[] args) {
        System.out.println(StringSum.sum("23", "09"));
    }
}

class StringSum {
    public static String sum(String num1, String num2) {
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int sum = n1 + n2;
        return String.valueOf(sum);
    }
}