package ru.gb.jcore.seminar5;

import java.io.File;

public class Tree {
    public static void print(File file, String indent, boolean isLast) {
        System.out.println(indent);
        if (isLast) {
            System.out.println("└─");
            indent += "  ";
        } else {
            System.out.println("├─");
            indent += "  ";
        }
        System.out.println(file.getName());

        File[] files = file.listFiles();
        if (files == null) {
            return;
        }

        int subDirTotal = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                subDirTotal++;
            }
        }

        int subDirCounter = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                subDirCounter++;
                print(files[i], indent, subDirCounter == subDirTotal);
            }
        }
    }
}
