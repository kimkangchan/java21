package exam18_예외처리;

class Test {
	public void a() throws NullPointerException {
		b();
	}

	public void b() throws NullPointerException {
		String s = null;
		System.out.println(s.length());
	}
}

public class ExceptionTest5 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Test t = new Test();
		try {
			t.a();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}

		System.out.println("프로그램 종료");

	} // end main

}
