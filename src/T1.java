import java.util.Arrays;
import java.util.Random;

public class T1 {
    public static final int SIZE = 3;
    public static void main(String[] args) {
        Random randomizer = new Random();
        int[][] matrix = new int[SIZE][SIZE];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = randomizer.nextInt(9) + 1;
            }
        }

        String str = Arrays.deepToString(matrix)
                .replace("], ","]\n")
                .replace("[[","[")
                .replace("]]","]");
        System.out.println("Исходная матрица:\n" + str);

        int jacheika = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i < j) {
                    jacheika = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = jacheika;
                }
            }
        }
        String str1 = Arrays.deepToString(matrix)
                .replace("], ","]\n")
                .replace("[[","[")
                .replace("]]","]");
        System.out.println("Транспонированная матрица:\n" + str1);
    }
}