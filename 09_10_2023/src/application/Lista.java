package application;

import entities.NumNegativo;

import java.util.Locale;
import java.util.Scanner;

public class Lista {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão digitados: ");
        int n = sc.nextInt();
        NumNegativo[] vetor = new NumNegativo[n];




        sc.close();
    }
}