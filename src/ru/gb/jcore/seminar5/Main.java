package ru.gb.jcore.seminar5;


import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        try {
            Copy.copyFolder(".", "backup");
        } catch (IOException e) {
            System.out.println("Copy error");
            e.printStackTrace();
        }

        //        print(new File("."), " ", true);

    }
}
