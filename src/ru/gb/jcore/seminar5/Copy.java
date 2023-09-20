package ru.gb.jcore.seminar5;


import java.io.*;

public class Copy {
    public static void copyFile(File src, File dst) throws IOException {
        try (InputStream in = new FileInputStream(src); OutputStream out = new FileOutputStream(dst)) {
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
        }
    }

    public static void copyFolder(String src, String dst) throws IOException {
        File fldSrc = new File(src);
        File fldDst = new File(dst);

        if (fldSrc.isDirectory()) {
            if (!fldDst.exists()) {
                fldDst.mkdir();
            }

            String[] listFiles = fldSrc.list();

            boolean isDstFolder = fldDst.getCanonicalPath().startsWith(fldSrc.getCanonicalPath());

            if (listFiles != null) {
                for (String file : listFiles) {
                    if (isDstFolder && file.equals(fldDst.getName())) {
                        continue;
                    }
                    copyFolder(src + File.separator + file, dst + File.separator + file);
                }
            } else {
                copyFile(fldSrc, fldDst);
            }
        }
    }
}
