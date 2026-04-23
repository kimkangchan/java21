package exam18_예외처리;

class Account {
	int balance = 100; // 잔고

	public void withdraw(int amt) throws InSufficentBalanceException {
		if (balance >= amt) {
			balance -= amt;
		} else {
			// 잔액부인 경우 시스템은 예외라고 인식 안함.
			// 하지만 개발자는 예외라고 가정 할 수 있기 때문에 명시적으로 예외발생 필요.
			throw new InSufficentBalanceException("잔액 부족으로 예외발생");
		}
	}
}

public class ExceptionTest7 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		Account acct = new Account();

		try {
			acct.withdraw(50);
			acct.withdraw(500);
		} catch (InSufficentBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("프로그램 종료");

	} // end main

}
