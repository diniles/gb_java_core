package ru.gb.jcore.seminar5;

import java.io.File;

public class Tree {

    public static void print(File file, String indent, boolean isLast) {
        System.out.print(indent);
        if (isLast) {
            System.out.print("└─");
            indent += "  ";
        } else {
            System.out.print("├─");
            indent += "│ ";
        }
        System.out.println(file.getName());

        File[] files = file.listFiles();
        if (files == null) {
            return;
        }

        int subDirTotal = 0;
        int filesTotal = 0;
        for (File value : files) {
            if (value.isDirectory()) {
                subDirTotal++;
            } else {
                filesTotal++;
            }
        }

        int subDirCounter = 0;
        for (File value : files) {
            if (value.isDirectory()) {
                subDirCounter++;
                print(value, indent, subDirCounter == subDirTotal);
            }
        }

        int fileCounter = 0;
        for (File value : files) {
            if (!value.isDirectory()) {
                fileCounter++;
                System.out.print(indent);
                if (fileCounter < filesTotal) {
                    System.out.print(" ├─");
                } else {
                    System.out.print(" └─");
                }
                System.out.println(value.getName());
            }
        }
    }
}
