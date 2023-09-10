package ru.gb.jcore.seminar4;

public class MyArraySizeException extends RuntimeException {
    MyArraySizeException(int expectedSize, int size, String message) {
        super(String.format("Expected %d %s", expectedSize, message));
    }
}
