package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
// Podanie ścieżki pliku w konsoli z klawiatury
    public class SciezkaPliku {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner scan = new Scanner(System.in);
            System.out.println("Podaj ścieżkę pliku: " + "'plikTest.txt'");
            String sciezka = scan.nextLine();
            File f = new File(sciezka);
            if (f.exists()) {
                System.out.println("Ścieżka poprawna");
            } else {
                System.out.println("Ścieżka niepoprawna");
                System.out.println("-----------------------------------------------------------------");
            }
//---------------------------------------------------------------
            // Podanie rozszerzenia pliku w konsoli z klawiatury

            Scanner scan2 = new Scanner(System.in);
            System.out.println("Podaj rozszerzenie pliku: " + "'plikTest'");
            String rozszerzenie = scan2.nextLine();
            File f1 = new File("plikTest.txt");
            if (f1.getName().endsWith(rozszerzenie)) {
                System.out.println("rozszerzenie poprawne, plik tekstowy");
            }
            else {
                System.out.println("rozszerzenie niepoprawne, to nie jest plik tekstowy");
            }
            System.out.println("-----------------------------------------------------------------");
//-----------------------------------------------------------------------------------------------------------
            //Sprawdzenie zdania w pliku tekstowym, nadpisanie na tekst wpisany do konsoli i sprawdzenie

            System.out.println("Zmiana zdania w pliku tekstowym");
            File f2 = new File("plikTest.txt"); //odczytuje zawartość pliku
            Scanner in = new Scanner(f2);

            String zdanie1 = in.nextLine();
            System.out.println("Tekst przed zmianą: " + zdanie1);


            Scanner scan3 = new Scanner(System.in);
            System.out.println("Wpisz swoje nowe zdanie:");
            String zd = scan3.nextLine();

            PrintWriter zmianaZdania = new PrintWriter("plikTest.txt");
            zmianaZdania.println(zd);
            zmianaZdania.close();

            File f3 = new File("plikTest.txt"); //odczytuje zawartość pliku
            Scanner in1 = new Scanner(f3);

            String zdanie2 = in1.nextLine();
            System.out.println("Tekst w pliku po zmianie: " + zdanie2);




        }
    }

