package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Movimentacao;

public class ExercicioBanco {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Movimentacao mov = new Movimentacao();

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine(); // Limpa o buffer
		mov.getNumber();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		mov.setHolder(holder);

		while (true) {
			System.out.print("initial deposit (y/n) ou (s) para sair do sistema: ");
			String tipo = sc.nextLine();
			mov.setTipo(tipo);

			if ("n".equals(tipo)) {
				System.out.println(mov);
			} else if ("y".equals(tipo)) {
				System.out.println("Enter initial deposit value: ");
				double balance = sc.nextDouble();
				mov.getBalance();
				mov.deposit(balance);

				System.out.println("\n===================Account data:===================");
				System.out.println("Account: " + number + " Holder: " + holder + " Balance: " 
				+ String.format("%.2f", mov));
				System.out.println("===================Account data:===================\n");
			} else if ("s".equals(tipo)) {
				System.out.println("Obrigado pela preferência e volte sempre!!!");
				System.exit(0);
			} else {
				System.out.println("Só é permitido apenas uma das opções!!! (y ou n)\nCaso queira sair, digite: s ");
			}

			// Verificando se a entrada é válida ("n", "y" ou "s") para sair do loop
			if ("n".equals(tipo) || "y".equals(tipo) || "s".equals(tipo)) {
				break;
			}
		}

		System.out.println("Enter initial deposit value: ");
		double balance = sc.nextDouble();
		System.out.println(mov);
		System.out.println("Enter a deposit value: ");
		System.out.println("Enter a withdraw value: ");

		/*
		 * Enter account number: 8532 Enter account holder: Alex Green Is there na
		 * initial deposit (y/n)? y
		 * 
		 * Enter initial deposit value: 500.00
		 * 
		 * ===================Account data:=================== Account 8532, Holder:
		 * Alex Green, Balance: $ 500.00
		 * 
		 * ===================================================
		 * 
		 * Enter a deposit value: 200.00
		 * 
		 * ===================Account data:=================== Account 8532, Holder:
		 * Alex Green, Balance: $700.00
		 * 
		 * ===================================================
		 * 
		 * Enter a withdraw value: 300.00 ===================Account
		 * data:=================== Account 8532, Holder: Alex Green, Balance: $ 395.00
		 * 
		 * ===================================================
		 */

		sc.close();
	}

}
