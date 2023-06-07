import java.util.Arrays;

public class Matrix {
    private final int[][] matrix;

    public Matrix(int weight, int height) {
        matrix = new int[weight][height];
        int count = 0;
        while (count <= weight / 2 && count <= height / 2) {
            for (int i = count; i < weight - count; i++) {
                for (int j = count; j < height - count; j++) {
                    matrix[i][j] = count + 1;
                }
            }
            count += 1;
        }
        //matrix[we]
    }
    public String toString() {
        return Arrays.deepToString(matrix)
                .replace("], ", "]\n")
                .replace("[[", "[")
                .replace("]]", "]");
    }
}