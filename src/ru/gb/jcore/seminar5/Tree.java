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
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                subDirTotal++;
            } else {
                filesTotal++;
            }
        }

        int subDirCounter = 0;
        for (int i = 0; i < files.length; i++) {
            if (files[i].isDirectory()) {
                subDirCounter++;
                print(files[i], indent, subDirCounter == subDirTotal);
            }
        }

        int fileCounter = 0;
        for (int i = 0; i < files.length; i++) {
            if (!files[i].isDirectory()) {
                fileCounter++;
                System.out.print(indent);
                if (fileCounter < filesTotal) {
                    System.out.print(" ├─");
                } else {
                    System.out.print(" └─");
                }
                System.out.println(files[i].getName());
            }
        }
    }
}
