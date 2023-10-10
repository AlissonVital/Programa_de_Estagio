package application;

import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão digitados: ");
        int n = sc.nextInt();
        Product[] vetor = new Product[n];

        for (int i = 0; i < vetor.length; i ++){
            System.out.print("Digite o " + (i+1) + "º Produto: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Digite o " + (i+1) + "º Preço: ");
            double price = sc.nextDouble();
            vetor[i] = new Product(name, price);
        }
        double soma = 0.0;
        for (int i = 0; i < vetor.length; i ++){
            soma += vetor[i].getPrice();
        }
        double media = soma / vetor.length;
        System.out.printf("Media %.2f%n= ", media);

        sc.close();
    }
}