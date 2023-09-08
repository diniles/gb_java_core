package ru.gb.jcore.seminar1.lib;

/**
 * Class for formatted print given matrix
 */
public class Formatter {
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.printf("%4d", elem);
            }
            System.out.println();
        }
        System.out.println();
    }
}
