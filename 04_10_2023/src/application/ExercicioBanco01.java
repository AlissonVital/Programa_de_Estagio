package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class ExercicioBanco01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Account account;

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine(); // Limpa o buffer
        String holder = sc.nextLine();

        char response;
        do {
            System.out.print("Initial deposit (y/n) or (s) to exit the system: ");
            response = sc.next().charAt(0);
            if (response != 'y' && response != 'n' && response != 's') {
                System.out.println("Invalid input. Please enter 'y', 'n', or 's'.");
            }
        } while (response != 'y' && response != 'n' && response != 's');

        if (response == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            account = new Account(number, holder, initialDeposit);
        } else if (response == 'n') {
            account = new Account(number, holder);
        } else {
            // Handle the case when 's' is entered to exit the system
            System.out.println("Exiting the system.");
            sc.close();
            return;
        }
        System.out.println(account);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("===============Update account data:================");
        System.out.println(account);

        System.out.print("");
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("===============Update account data:================");
        System.out.println(account);
        System.out.println("Fim da execução!!!");

        sc.close();
    }
}
