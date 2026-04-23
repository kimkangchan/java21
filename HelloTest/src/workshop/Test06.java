package workshop;

public class Test06 {

	public static void main(String[] args) {
		
		int i = 9;
		String result = (i%2) == 1 ? "홀수":"짝수";
		System.out.printf("선언 변수 %d 일때 결과 : \n숫자 %d는 %s입니다", i, i, result);
	}

}
