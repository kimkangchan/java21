package exam04_연산자;

public class Operator06_3항연산자 {
	

	public static void main(String[] args) {
		
		int num = 10;
		
		int result = (num > 2) ? 100 : 200;
		System.out.println(result);
		
		String result2 = (num > 2) ? "홍길동" : "이순신";
		System.out.println(result2);
		
		//중첩가능
		int result3 = (num > 2) ? (num < 29) ? 10 : 20  : 200;
		System.out.println(result3);
	}

}
