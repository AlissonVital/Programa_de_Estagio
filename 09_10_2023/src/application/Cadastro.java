package application;


import entities.DadosCadastro;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros serão digitados: ");
        int n = sc.nextInt();
        DadosCadastro[] vetor = new DadosCadastro[n];


        double somaAltura = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Dados " + (i + 1) + "ª Pessoa: ");
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Idade: ");
            int idade = sc.nextInt();
            System.out.print("Altura: ");
            double altura = sc.nextDouble();
            vetor[i] = new DadosCadastro(nome, idade, altura);
            somaAltura += vetor[i].getAltura();
        }

        double soma = 0.0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                soma += 1.0;
            }
        }

        double mediaAltura = (somaAltura / vetor.length);
        double mediaMenores = (soma / vetor.length) * 100;

        System.out.println();
        System.out.println("ALTURA MÉDIA: " + mediaAltura);
        System.out.printf("PESSOAS MENORES DE 16 ANOS: %.1f%%%n", mediaMenores);

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].getIdade() < 16) {
                System.out.println(vetor[i].getNome());
            }
        }
        sc.close();
    }
}