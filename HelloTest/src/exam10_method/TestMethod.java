package exam10_method;

public class TestMethod {

	public static void main(String[] args) {

		Method m = new Method();

		m.method();

		m.method2(10, "홍길동");

		int result = m.method3();
		System.out.println("결과값 : " + result);

		int result2 = m.method4(10, 20);
		System.out.println("결과값 : " + result2);
	}

}
