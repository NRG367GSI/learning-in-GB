package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        String[] name = {"C", "e", "h"};
        System.out.println(String.join("", name));
    }

    public static void ExpDir() {
        try {
            String pathProperty = System.getProperty("user.dir");
            String fileSep = System.getProperty("file.separator");
            String pathFile = (pathProperty + fileSep).concat("TEST.txt");
            File fileTest = new File(pathFile);
            System.out.println(pathFile);
            //System.out.println("\n" + fileTest.getAbsolutePath());
            if (fileTest.createNewFile()) {
                System.out.println("Файл создан! \n");
            } else {
                System.out.println("Файл не создан! \n");
            }
        } catch (Exception e) {
            System.out.println("Вызвана ошибка: " + e);
        } finally {
            System.out.println("finally");
        }
    }
}