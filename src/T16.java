import java.util.Scanner;

public class T16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        int count_small = 0;
        int count_big = 0;
        for (int i = 0; i < word.length(); i++) {
            char bukva = word.charAt(i);
            if(word.charAt(i) == Character.toUpperCase(bukva)){
                count_big += 1;
            } else{
                count_small += 1;
            }
        }
        if (count_big <= count_small){
            word = word.toLowerCase();
        } else{
            word = word.toUpperCase();
        }
        System.out.println(word);
    }
}
