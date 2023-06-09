package org.example;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        ExtractEntry(null);
    }

        static private String targetDirectory = "/example/directory/";

    public static void ExtractEntry(ZipFile zipFile) throws IOException {

        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        ZipEntry entry = entries.nextElement();
        InputStream inputStream = zipFile.getInputStream(entry);

        File file = new File(targetDirectory + entry.getName());

        Files.copy(inputStream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    int myPow(int num, int exponent) throws ClassNotFoundException {
        num = num * myPow(num, exponent - 1);

        String className = System.getProperty("Main");
        Class clazz = Class.forName(className);  // Noncompliant



        return num;  // this is never reached
    }

    int myPows(int num, int exponent) throws ClassNotFoundException {
        num = num * myPow(num, exponent - 1);
        return num;  // this is never reached
    }

}
