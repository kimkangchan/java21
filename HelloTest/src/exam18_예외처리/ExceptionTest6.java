package exam18_예외처리;

class Test2 {
	public void a() throws NullPointerException, ArithmeticException {
		b();
	}

	public void b() throws NullPointerException, ArithmeticException {
		// NullPointerException 발
		String s = null;
		System.out.println(s.length());

		// ArithmeticException 발
		int n = 0;
		int result = 10 / n;
		System.out.println("결과 : " + result);
	}
}

public class ExceptionTest6 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Test2 t = new Test2();
		try {
			t.a();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// e.printStackTrace();
		}
		System.out.println("프로그램 종료");

	} // end main

}
