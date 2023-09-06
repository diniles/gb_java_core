package seminar1;

import seminar1.lib.Formatter;
import seminar1.lib.Matrix;

/**
 * Main class
 */
public class Main {
    public static void main(String[] args) {
        int[][] matrix = Matrix.getMatrix(3);
        Formatter.printMatrix(matrix);
    }
}
