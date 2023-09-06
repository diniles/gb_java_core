package seminar1;

/**
 * Class for generate matrix according given size
 */
public class Matrix {

    public static int[][] getMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = i + j;
            }
        }
        return matrix;
    }
}
