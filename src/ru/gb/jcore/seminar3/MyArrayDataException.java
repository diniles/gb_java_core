package ru.gb.jcore.seminar3;

public class MyArrayDataException extends RuntimeException {
    public MyArrayDataException(int i, int j) {
        super(String.format("Found not a number on address %d %d", i, j));
    }
}
