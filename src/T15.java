import java.util.ArrayList;
import java.util.Scanner;

public class T15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        String[] words = string.split(" ");
        ArrayList <String> new_words = new ArrayList<>();
        new_words.add(words[0]);
        for (String word : words) {
            if(!new_words.contains(word)){
                new_words.add(word);
            }
        }
        System.out.println(new_words);
    }
}
