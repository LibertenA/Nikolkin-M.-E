import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        int maximum = 0;
        int maximum_i = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            if(array[i] > maximum){
                maximum = array[i];
                maximum_i = i;
            }
        }
        int[] array_left = new int[maximum_i];
        int[] array_right = new int[array.length - maximum_i - 1];
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < maximum_i){
                array_left[i] = array[i];
            }else if(i>maximum_i){
                array_right[j] = array[i];
                j += 1;
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Массив чисел слева от максимума: " + Arrays.toString(array_left));
        System.out.println("Массив чисел справа от максимума: " + Arrays.toString(array_right));
    }
}