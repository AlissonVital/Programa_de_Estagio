package entities;

public class Movimentacao {

	private int number;
	private String holder;
	private double balance;
	private String tipo;

	public Movimentacao() {
	}

	public Movimentacao(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Movimentacao(int number, String holder, double initialDeposit) {
		this.number = number;
		this.holder = holder;
		deposit(initialDeposit);
	}

	public int getNumber() {
		return number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void deposit(double amaunt) {
		balance += amaunt;
	}

	public void withdraw(double amaunt) {
		balance -= (balance - 5.00);
	}

	/*
	 * public void deposit(double valueToDeposit) { this.balance += valueToDeposit;
	 * System.out.println("===================Account data:===================");
	 * System.out.println("Account: " + number); System.out.println("Holder: " +
	 * holder); System.out.println("Balance: \t" + String.format("%.2f", balance));
	 */

	/*
	 * public String toString() { return
	 * "===================Account data:===================" + " \n| Account: \t" +
	 * number + "\t| \n| Holder: \t" + holder + "\t| \n| Balance: \t" +
	 * String.format(" %.2f", deposit()) + "\t| \n" +
	 * "===================================================\n";
	 */
}
