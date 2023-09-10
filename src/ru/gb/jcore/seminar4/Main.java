package ru.gb.jcore.seminar4;

public class Main {
    private static final int MATRIX_SIZE = 4;
    private static final String[][] MATRIX = {
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"},
            {"1", "2", "3", "4"}
    };


    private static void checkMatrixSize(String[][] matrix) {
        if (matrix.length != 4)
            throw new MyArraySizeException(MATRIX_SIZE, matrix.length, "lines");
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != 4) {
                throw new MyArraySizeException(MATRIX_SIZE, matrix.length, "cols in line " + (i + 1));
            }
        }
    }

    public static void main(String[] args) {
        String[][] matrix = MATRIX;
        checkMatrixSize(matrix);
    }

}
