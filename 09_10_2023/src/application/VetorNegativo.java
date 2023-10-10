package application;

import entities.NumNegativo;

import java.util.Locale;
import java.util.Scanner;

public class VetorNegativo {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão digitados: ");
        int n = sc.nextInt();
        NumNegativo[] vetor = new NumNegativo[n];


        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º Numero: ");
            sc.nextLine();
            int num = sc.nextInt();
            vetor[i] = new NumNegativo(num);
        }

        int soma = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getNum() < 0) {
                soma += 1;
            }
        }

        System.out.println("NÚMEROS NEGATIVOS: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getNum() < 0) {
                System.out.println(vetor[i].getNum());
            }
        }

        System.out.println("Total de números Negativos: " + soma);

        sc.close();
    }
}