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
        int count_1 = 0;
        int length = arrayList.size();
        for (i = number_M+1; i < number_N; i++) {
            int j = 2;
            while (j < length) {
                if (i % arrayList.get(j) == 0) {
                    count += 1;
                    //break;
                }
                j += 1;
            } if (count == length - 2){
                count_1 += i;
            }
        }
        System.out.println(count_1);
    }
}