package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Odczyt {
    public static void main(String[] args) throws FileNotFoundException {

//ćwiczenia wstawianie tekstu do pliku txt

        PrintWriter zapis = new PrintWriter("plikTest.txt");
        zapis.println("Ala ma kota, a kot ma Alę i są szczęśliwi");
        zapis.close();

        File file = new File("plikTest.txt"); //odczytuje zawartość pliku
        Scanner in = new Scanner(file);

        String zdanie = in.nextLine();
        System.out.println(zdanie);
    }
}