import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[]{"а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "щ", "ъ", "ы", "ь", "э", "ю", "я"};
        Scanner scanner = new Scanner(System.in);
        String old_word = scanner.nextLine();
        String direction = scanner.nextLine(); //направление
        int shift = scanner.nextInt(); //сдвиг
        String new_word = "";
        if (direction.equalsIgnoreCase("Вправо")) {
            for (int i = 0; i < old_word.length(); i++) {
                char ch = old_word.charAt(i);
                for (int j = 0; j < array.length; j++) {
                    if (Character.toString(ch).equalsIgnoreCase(array[j])) {
                        if (j + shift >= 33) {
                            new_word += array[j + shift - array.length];
                        } else {
                            new_word += array[j + shift];
                        }
                    }
                }
            }
        }
        else if(direction.equalsIgnoreCase("Влево")){
            for (int i = 0; i < old_word.length(); i++) {
                char ch = old_word.charAt(i);
                for (int j = 0; j < array.length; j++) {
                    if (Character.toString(ch).equalsIgnoreCase(array[j])){
                        if(j - shift < 0){
                            new_word += array[j - shift + array.length];
                        } else {
                            new_word += array[j - shift];
                        }
                    }
                }
            }
        }else{
            System.out.println("Вы неправильно ввели направление");
        }
        System.out.println(new_word);
    }
}