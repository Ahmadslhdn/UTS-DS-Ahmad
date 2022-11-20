package com.company;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilai = new int[10];

        System.out.println( "\n___________________________");
        System.out.println( "| By Ahmad Solehudin| ");
        System.out.println( "---------------------------\n");

        for (int i =0; i < nilai.length; i++) {
            System.out.print("Masukan Angka ke  " + (i+1) + " : ");
            nilai[i] = input.nextInt();

            if  (i % 2 == 0) {
                System.out.println(nilai[i] + " Adalah Angka Genap\n");

            } else {
                System.out.println(nilai[i] + " Adalah Angka Ganjil\n");
            }
        }
    }
}
