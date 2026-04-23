package exam18_예외처리;

public class ExceptionTest2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");

		try {
			int n = 0;
			int result = 10 / n;
			System.out.println("결과 : " + result);
		} catch (ArithmeticException e) { // 정확한 예외 클래스 사용을 권장함.
		//catch(RuntimeException e){
		//catch(Exception e){ 
			// 예외 처리 코드
			System.out.println("0으로 나누어서 예외발생!");
		}

		System.out.println("프로그램 종료");

	} // end main

}
