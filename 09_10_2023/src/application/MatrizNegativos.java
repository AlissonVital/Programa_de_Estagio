package application;

import java.util.Locale;
import java.util.Scanner;

public class MatrizNegativos {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Digite o valor de n (ordem da matriz): ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("Main Diagonal:");
        for (int i = 0; i < mat.length; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int cont = 0;
        System.out.println();
        System.out.println("Posições negativas:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    System.out.println("[" + i + "][" + j + "] = [" + mat[i][j] + "]");
                    cont++;
                }
            }
        }
        System.out.println();
        System.out.println("Total de posições negativas: " + cont);

        int menor = 0;
        int posicaoMenorI = 0;
        int posicaoMenorJ = 0;
        System.out.println();
        System.out.println("Menor número da matriz:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] <= menor) {
                    menor = mat[i][j];
                    posicaoMenorI = i;
                    posicaoMenorJ = j;
                }
            }
        }
        System.out.println("Menor número digitado: " + menor);
        System.out.println("Esta na posição: " + "[" + posicaoMenorI + "][" + posicaoMenorJ + "]");

        int maior = menor;
        int posicaoMaior = 0;
        int posicaoMaiorI = 0;
        int posicaoMaiorJ = 0;
        System.out.println();
        System.out.println("Maior número da matriz:");
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] >= maior) {
                    maior = mat[i][j];
                    posicaoMaiorI = i;
                    posicaoMaiorJ = j;
                }
            }
        }
        System.out.println("Menor número digitado: " + maior);
        System.out.println("Esta na posição: " + "[" + posicaoMaiorI + "][" + posicaoMaiorJ + "]");

        sc.close();
    }
}
