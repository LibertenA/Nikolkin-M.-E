import java.util.Arrays;
import java.util.Scanner;
public class T2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int array[]= new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();

        }
        int count = 0;

        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length; i++) {
            if(array[i] == 1){
                count += 1;
            }
        }
        System.out.println("Количество работников:" + count);
    }
}
