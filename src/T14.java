import java.util.Arrays;
import java.util.Scanner;

public class T14 {
    public static void main(String[] args) {
        Integer[] memory= {2, 1, null};
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int minimum_i = 0;
        for(int i = 0; i < memory.length; i++) {
            if (memory[i] == null) {
                memory[i] = number;
            }
            if (memory[minimum_i] > memory[i]) {
                minimum_i = memory[i];
            }
        }
        memory[minimum_i] = number;
        System.out.println(Arrays.deepToString(memory));
    }
}
