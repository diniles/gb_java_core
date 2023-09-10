package ru.gb.jcore.seminar4;

public static class MyArraySizeException extends Exception {
    MyArraySizeException(int expectedSize, int rows, int cols) {
        super(String.format("Expected %d ", expectedSize));
    }
}
