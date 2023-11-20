package org.example;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class Main2 {

  private static final Main2 instance = new Main2();

  // private constructor to avoid client applications using the constructor
  private Main2(){
    System.out.println("toto1");

    while (true) {

    }

  }

  public static Main2 getInstance() {
    return instance;
  }

  public boolean foo() {
    return false;
  }

  static private String targetDirectory = "/example/directory/";

  public static void ExtractEntry(ZipFile zipFile) throws IOException {
    var toto = "tedst";

    Enumeration<? extends ZipEntry> entries = zipFile.entries();
    Enumeration<? extends ZipEntry> entries2 = zipFile.entries();
    Enumeration<? extends ZipEntry> entries3 = zipFile.entries();

    ZipEntry entry = entries.nextElement();
    InputStream inputStream = zipFile.getInputStream(entry);

    File file = new File(targetDirectory + entry.getName());

    Files.copy(inputStream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
  }

  public static void ExtractEntry2(ZipFile zipFile) throws IOException {
    var toto = "tedst";

    Enumeration<? extends ZipEntry> entries = zipFile.entries();
    Enumeration<? extends ZipEntry> entries2 = zipFile.entries();
    Enumeration<? extends ZipEntry> entries3 = zipFile.entries();

    ZipEntry entry = entries.nextElement();
    InputStream inputStream = zipFile.getInputStream(entry);

    File file = new File(targetDirectory + entry.getName());

    Files.copy(inputStream, file.toPath(), StandardCopyOption.REPLACE_EXISTING);
  }
}
