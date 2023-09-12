package ru.gb.jcore.seminar5;

import java.io.File;

public class CopyFiles {

    public static void copy(String path) {
        File filePath = new File(new File(path).getPath());


        File[] files = filePath.listFiles();

        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                copy(files[i].toString());
            }
            System.out.println(files[i]);
        }
    }
}
