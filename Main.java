package com.company;

public class Main {
    public static void main(String[] args) {
        System.out.println("No 1");
        int arangka[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        System.out.println("bilangan genap");
        for (int i = 0; i< arangka.length; i++){
            if (arangka[i]%2 == 0){
                System.out.println(arangka[i]);
            }
        }
        System.out.println("bilangan ganjil");
        for (int i =0; i<arangka.length; i++){
            if (arangka[i]%2!= 0){
                System.out.println(arangka[i]);
            }
        }
    }
}
