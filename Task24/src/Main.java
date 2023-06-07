import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = -1;
        do {
            i++;
            arrayList.add(scanner.nextInt());
        } while (arrayList.get(i) != 0);
        arrayList.remove(i);

        int number_M = arrayList.get(0);
        int number_N = arrayList.get(1);
        int count = 0;
        int lenght = arrayList.size();
        for (i = number_M+1; i < number_N; i++) {
            int j = 2;
            while (j < lenght) {
                if (i % arrayList.get(j) == 0) {
                    count += i;
                    break;
                }
                j += 1;
            }
        }
        System.out.println(count);
    }
}