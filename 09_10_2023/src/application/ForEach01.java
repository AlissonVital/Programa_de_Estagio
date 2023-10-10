package application;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ForEach01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[]{"Amarilda P", "Jubuleia S", "Rodolfus T", "Kaleb D", "Jubieu K", "Kabbritão L", "Hellem D", "Adriana F"};

        // Ordenar os nomes em ordem alfabética
        Arrays.sort(vect);

        System.out.println("Nomes em ordem alfabética:");
        for (String obj : vect) {
            System.out.println(obj);
        }

        System.out.println();
        System.out.println("Nomes que começam com 'A':");
        for (String obj : vect) {
            if (obj.toLowerCase().startsWith("a")) { // Ignora o caso (maiúscula/minúscula)
                System.out.println(obj);
            }
        }

        System.out.println();
        System.out.println("Nomes que terminam com 'D':");
        for (String obj : vect) {
            if (obj.toLowerCase().endsWith("d")) { // Ignora o caso (maiúscula/minúscula)
                System.out.println(obj);
            }
        }

        sc.close();
    }
}
