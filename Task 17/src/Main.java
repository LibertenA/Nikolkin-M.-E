import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String brackets = scanner.nextLine();
        System.out.print(brackets + " => ");
        int count = 0;
        int count_1 = 0;
        for (int i = 0; i < brackets.length(); i++) {
            char symbol = brackets.charAt(i);
            if(symbol != '(' && symbol != ')'){
                System.out.println("Ошибка! Вы ввели не скобочки!");

            }else{
                if(symbol == '('){
                    count += 1;
                } else{
                    count_1 += 1;
                }
            }
        }
        if(count == count_1){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}