package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	private String tipo;

	public Account() {
	}

	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}

	public Account(int number, String holder, double initialDeposit) {
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
		balance -= (amaunt + 5.00);
	}

	
	 public String toString() { 
		 return "===================Account data:==================="				 
				 + "\n| Account: \t \t" 
				 + number 
				 + "\n| Holder: \t \t" 
				 + holder 
				 + "\n| Balance: $ \t\t" 
				 + String.format("%.2f",balance) + "\n" 
				 + "===================================================\n";
	 }
	 
}
