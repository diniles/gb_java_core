package ru.gb.jcore.seminar5;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class CopyFiles {

    public static void copy(String path) throws IOException {
        File filePath = new File(new File(path).getPath());


        File[] files = filePath.listFiles();
        Files.createDirectory(Path.of("./backup"));

        DirectoryStream<Path> dir = Files.newDirectoryStream(Path.of("."));
        for (Path file : dir) {
            if (Files.isDirectory(file)) continue;
            Files.copy(file, Path.of("./backup/" + file.toString()));
        }

//        for (int i = 0; i < files.length; i++) {
//            if (files[i].isDirectory()) {
//                copy(files[i].toString());
//            }
//            System.out.println(files[i]);
//        }
    }
}
