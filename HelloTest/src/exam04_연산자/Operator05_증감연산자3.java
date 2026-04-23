package exam04_연산자;

public class Operator05_증감연산자3 {
	
	public static int method() {
		int n = 10;
		return ++n;
	}
	
	public static int method2() {
		int n = 10;
		return n++;
	}

	public static void main(String[] args) {
		
		System.out.println("전치 : " + method());
		System.out.println("후치 : " + method2());
		
	}

}
