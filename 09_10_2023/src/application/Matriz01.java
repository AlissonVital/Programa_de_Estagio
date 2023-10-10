package application;
import java.util.Locale;
import java.util.Scanner;

public class Matriz01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*System.out.print("Quantos numeros serão digitados: ");*/
        int n = sc.nextInt();
        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Main Diagonal");
        for (int i = 0; i < n; i++) {
            System.out.print(mat[i][i] + " ");
        }

        int cont = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    cont ++;
                }
            }
        }

        System.out.println("\nPosição negativa: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] < 0) {
                    System.out.print(mat[i][j] + "");
                }
            }
        }

        System.out.println("\nTotal de posições negativas: " + cont);

        sc.close();
    }
}

