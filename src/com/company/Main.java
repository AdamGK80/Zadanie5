package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    /*
     * Cwiczenia:
     * 1. Zastanow sie jak ulepszyc (zmniejszyc liczbe iteracji)
     * zaproponowana funkcje sortujaca (tzw. sortowanie babelkowe).
     * 2. Sprobuj wykorzystac biblioteczna metode
     * java.util.Arrays.sort() do posortowania tablicy.
     * Jaki algorytm sortowania zaimplementowany jest w tej metodzie?
     */

    public static void main(String[] args) {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            int r;
            System.out.println("Podaj rozmiar: ");
            r = Integer.parseInt(in.readLine());
            int[] t = new int[r];
            wczytaj_tablice(t, r);

            System.out.println("Tablica przed posortowaniem:");
            wypisz_tablice(t, r);

            //babelek(t);
            Arrays.sort(t); // wykorzystanie Arrays.sort - sortowanie tablicy.
            //W Javie tablice to klasa zdefiniowana w pakiecie java.util, która udostępnia metodę sort() do sortowania tablicy w porządku rosnącym. Do sortowania wykorzystuje algorytm Dual-Pivot Quicksort.
            System.out.println("Tablica posortowana:");
            wypisz_tablice(t, r);

        } catch(IOException e) {
        }
    }

    public static void babelek(int[] tablica) {
        int temp;
        for(int i = 0; i < tablica.length; i++) {
            for(int j = i; j < tablica.length; j++) {
                if(tablica[i] > tablica[j]) {
                    temp = tablica[i];
                    tablica[i] = tablica[j];
                    tablica[j] = temp;
                }
            }
        }
    }

    public static int suma(int[] tablica, int rozmiar) {
        int s = 0;
        for ( int i = 0; i < rozmiar; i++ )
            s += tablica[i];
        return s;
    }

    public static int minimum(int[] tablica, int rozmiar) {
        int min = tablica[0];
        for ( int i = 1; i < rozmiar; i++ )
            if ( tablica[i] < min )
                min = tablica[i];
        return min;
    }

    public static void wczytaj_tablice(int[] tablica, int rozmiar) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        for ( int i = 0; i < rozmiar; i++ ) {
            System.out.println("Podaj liczbe (tablica["+i+"]): ");
            tablica[i] = Integer.parseInt(in.readLine());
        }
    }

    public static void wypisz_tablice(int[] tablica, int rozmiar) {
        //Arrays.sort(tablica);
        for ( int i = 0; i < rozmiar; i++ )
            System.out.println("tablica["+i+"] = "+tablica[i]);
    }
}
