package opps;

class Account {
	private int balance;

	public Account(int balance) {

		this.balance = balance;
	}

	public Account() {

	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int amt) {
		this.balance += amt;
	}

	public void withdrawBalance(int amt) {
		this.balance -= amt;
	}
}

public class Bank {
	public static void main(String a[]) {
		Account anilabha = new Account();
		Account rahul = new Account(9000);
		anilabha.setBalance(1000);
		anilabha.setBalance(1000);
		anilabha.withdrawBalance(100);
		System.out.println("anilabha bal = " + anilabha.getBalance());
		System.out.println("rahul bal = " + rahul.getBalance());
	}
}