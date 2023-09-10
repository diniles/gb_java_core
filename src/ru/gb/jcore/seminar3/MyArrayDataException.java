package ru.gb.jcore.seminar3;

public class MyArrayDataException extends RuntimeException {
    MyArrayDataException(String message) {
        super("Found not a number " + message);
    }
}
