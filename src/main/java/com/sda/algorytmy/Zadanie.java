package com.sda.algorytmy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zadanie {
    public static void zad1() {
        System.out.println("Prosze podaj imie: ");
        List<String> stringImie = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String linia = sc.nextLine();
            if (linia.equals("-")) {
                break;
            }
            stringImie.add(linia);
        }
        System.out.println("LISTA IMION: ");
        for (String el: stringImie){
            System.out.println("Imie: " + el);
        }
    }
}
