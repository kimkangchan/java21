package exam03_데이터형변환;

public class CastTest01_묵시적 {

	public static void main(String[] args) {
		
		byte b = 10;
		short b2 = b; // byte 타입의 b가 short 타입으로 변경
		int b3 = b2;
		long b4 = b3;
		
		float f = b4;
		double f2 = f;
		
		// byte x = f2; 역은 불가!
		
		//char > int (문자가 정수인 int로 자동변경 가능, 아스키 코드값)
		char c = 'A';
		int n = c;
		System.out.println(n); //65
		System.out.println(n+1); // 66
		
		System.out.printf("%c \n",65); // A
		
		int x = 'A';
		
		char c2 = 'a';
		int n2 = c2;
		System.out.println(n2); //97
		
		//정수형 중에서 int보다 작은 타입의 연산결과는 int로 형변환되어 반환된다
		short s = 10;
		short s2 = 20;
		//short s3 = s + s2 // 에러, 각각은 short이지만 연산된 s + s2는 int형
		int s4 = s+s2;
		
		//작은 타입과 큰타입을 연산하면 결과가 큰 타입으로 반환
		int k = 10;
		double k2 = 20;
		double k4 = k + k2;
		
		//문자열 + ( 비 ) 문자열 → 문자열로 반환됨
		System.out.println("hello" + "world");
		System.out.println("hello" + 10);
		System.out.println("hello" + 3.14);
		System.out.println("hello" + true);
		
		System.out.println("hello" + 10+20+30); // heloo102030
		System.out.println(10+20+30 + "hello"); // 60hello
	}

}
