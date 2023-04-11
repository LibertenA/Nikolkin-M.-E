import java.util.Scanner;

public class T11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        String[] vowels = {"а", "и", "о", "е", "ё", "у", "я", "э", "ю", "ы", "e", "o", "i", "u", "a"};
        for (int i = 0; i < vowels.length; i++) {
            word = word.replace(vowels[i], "");
        }
        System.out.println(word);
    }
}
