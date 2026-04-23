package pack03;

public class TestAccount {

	public static void main(String[] args) {
		Account account;
		account = new Account("441-0290-1203",500000,7.3);
		
		account.showInfo();
		account.withdraw(600000);
		account.deposit(20000);
		
		account.calculateInterest();
		
		account.showInfo();
		System.out.println(account.calculateInterest());
	}

}
