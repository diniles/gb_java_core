package ru.gb.jcore.seminar5;

import java.io.IOException;
import java.io.File;

import static ru.gb.jcore.seminar5.Tree.print;

public class Main {

    public static void main(String[] args) {
        try {
            Copy.copyFolder(".", "backup");
        } catch (IOException e) {
            System.out.println("Copy error");
            e.printStackTrace();
        }

        print(new File("."), " ", true);

    }
}
