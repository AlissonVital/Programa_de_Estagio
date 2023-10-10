package application;
import java.util.Locale;
import java.util.Scanner;
public class ForEach {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String[] vect = new String[]{"Amarilda P", "Jubuleia S", "Rodolfus T", "Kaleb D", "Jubieu K", "Kabbritão L", "Hellem H"};

        for (int i = 0; i < vect.length; i++) {
            System.out.println(vect[i]);
        }

        System.out.println();
        System.out.println("=====================USANDO FOR EACH=====================");
        System.out.println();
        for (String obj : vect) {
            System.out.println(obj);
        }

        sc.close();
    }
}