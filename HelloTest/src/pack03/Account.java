package pack03;

public class Account {

	private String account;
	private int balance;
	private double interestRate;

	public Account() {

	}

	public Account(String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public double calculateInterest() {
		return balance * interestRate;
	}

	public void deposit(int money) {

		balance += money;
	}

	public void withdraw(int money) {
		if (balance < money) {
			System.out.println("출금 할 수 없습니다.");
		} else {
			balance -= money;

		}
	}

	public void showInfo() {
		System.out.println("계좌정보 : " + account + " 현재잔액 : " + balance);
	}

}
