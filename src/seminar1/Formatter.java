package seminar1;

public class Formatter {
    public static void printMatrix(int[][] matrix) {
        int length = matrix.length;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("| ");
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                stringBuffer.append(matrix[i][j]).append(" |");
            }
            stringBuffer.append("]n");
        }
        System.out.println(stringBuffer);
    }
}
