package exam10_method;

public class Method {
	// 1.파라미터 없고 리턴값 없음
	public void method() {
		System.out.println("method");
	}

	// 파라미터 있고 리턴값 없는 경우
	public void method2(int n, String s) {
		System.out.println("method2 : " + n + s);
	}

	// 파라미터 없고 리턴값 있는 경우
	public int method3() {
		System.out.println("method3");
		return 100;
	}

	// 파라미터 있고 리턴값 있는 경우
	public int method4(int n, int n2) {
		System.out.println("method4 : " + n + "\t" + n2);
		return n + n2;
	}
	
	//오버로딩 메서드
	public void a() {}
	// public int a() {} 에러!! 식별이 안되기 때문
	public void a(int n) {}
	public void a(String s) {}
	public void a(int n,String s) {}
	public void a(String s, int n) {}


}
