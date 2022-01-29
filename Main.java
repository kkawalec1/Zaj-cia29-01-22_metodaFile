package com.company;

import java.io.File;
import java.nio.file.Path;

public class Main {

    public static void main(String[] args) {
        //File file1 = new File("C:\\Users\\uczen.A306K09\\IdeaProjects\\Zaj.29.01.22 p. Czaja\\src\\com\\company\\plikTest.txt");
        File file1 = new File("plikTest.txt");
        if (file1.getName().endsWith("txt")) {
            System.out.println("plik tekstowy");
        }
         else {
            System.out.println("plik inny");
        }





        if (file1.exists()) {
            System.out.println("plik istnieje");
        } else {
            System.out.println("plik nie istnieje");

            // write your code here
        }

//        Path path1 = file1.toPath();
//        path1.toFile();
    }
}
