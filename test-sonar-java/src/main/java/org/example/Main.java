package org.example;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Enumeration;   
import java.util.Vector;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Main {
    public static String toto = "test";

    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");
        ExtractEntry(null);
        Main2 m = Main2.getInstance();

        Vector cats = new Vector<>();
    }

        static private String targetDirectory = "/example/directory/";

    public static void ExtractEntry(ZipFile zipFile) throws IOException {
        toto = "tedst";

        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        Enumeration<? extends ZipEntry> entries2 = zipFile.entries();
        Enumeration<? extends ZipEntry> entries3 = zipFile.entries();

        ZipEntry entry = entries.nextElement();
        InputStream inputStream = zipFile.getInputStream(entry);

        File file = new File(targetDirectory + entry.getName());

        Files.copy(inputStream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    int myPow(int num, int exponent) throws ClassNotFoundException {
        num = num * myPow(num, exponent - 1);

        String className = System.getProperty("Main");
        Class clazz = Class.forName(className);  // Noncompliant

        System.out.println("toto1");
        System.out.println("toto1");
        System.out.println("toto1");

        return num;  // this is never reached
    }

    int myPow2(int num, int exponent) throws ClassNotFoundException {
        num = num * myPow(num, exponent - 1);

        String className = System.getProperty("Main");
        Class clazz = Class.forName(className);  // Noncompliant

        System.out.println("toto1");
        System.out.println("toto1");
        System.out.println("toto1");
        System.out.println("toto1");

        return num;  // this is never reached
    }

    int myPows(int num, int exponent) throws ClassNotFoundException {
        num = num * myPow(num, exponent - 1);
        return num;  // this is never reached
    }

}
