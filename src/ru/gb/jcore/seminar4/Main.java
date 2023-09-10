package ru.gb.jcore.seminar4;

public class Main {
    private static final int MATRIX_SIZE = 4;


    public static void main(String[] args) {
        final String[][] MATRIX = {
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}
        };
        System.out.println(sumOfMatrix(MATRIX));
    }

    private static int sumOfMatrix(String[][] matrix) {
        if (matrix.length != 4)
            throw new MyArraySizeException(MATRIX_SIZE, matrix.length, "lines");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != 4) {
                throw new MyArraySizeException(MATRIX_SIZE, matrix[i].length, "cols in line " + (i + 1));
            }
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sum += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        return sum;
    }
}
