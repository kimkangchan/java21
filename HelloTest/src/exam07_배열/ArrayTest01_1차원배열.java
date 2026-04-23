package exam07_배열;

public class ArrayTest01_1차원배열 {

	public static void main(String[] args) {

		// 정수 값 : 1,2,3 관리하자

		// 1. 배열 선언
		// 문법 : 데이터형 [] 변수명 ;
		// 생성 메모리? 로컬 변수이기 때문에 stack에 저장
		int[] num;

		// 2. 배열생성
		// 문법 : 배열명 = new 데이터형 [크기]
		// 배열이 생성되면서 데이터형에 맞는 값으로 자동 초기화됨.
		// 정수 : 0, 실수 : 0.0, 논리 : false, 참조 : null
		// 생성 메모리? 인스턴스 메모리이기 때문에 heap에 저장
		num = new int[3];

		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		// System.out.println(num[3]); //ArrayIndexOutOfBoundsException에러 발생

		// 3. 배열 초기화
		num[0] = 1;
		num[1] = 2;
		num[2] = 3;

		System.out.println("배열길이 : " + num.length);

		for (int i = 0; i < num.length; i++) {
			System.out.printf("num[%d] = %d\n", i, num[i]);
		}
		
		
		//향상된 for 문
		for(int n : num) {
			System.out.println(n);
		}
	}

}
