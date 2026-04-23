package exam17_유틸리티;

public class WrapperClassTest {

	public static void main(String[] args) {
		// 1. 수치데이터 값의 범위
		System.out.println("int 값최소화 : " + Integer.MIN_VALUE);
		System.out.println("int 값최대화 : " + Integer.MAX_VALUE);

		System.out.println("double 값최소화 : " + Double.MIN_VALUE);
		System.out.println("double 값최대화 : " + Double.MAX_VALUE);

		// 2."10" --> 10
		System.out.println("문자열을 정수로 변환: " + Integer.parseInt("10"));
		System.out.println("문자열을 실수로 변환: " + Float.parseFloat("3.14"));
		
		System.out.println("정수 sum : " + Integer.sum(10, 20));
		System.out.println("정수 max : " + Integer.max(10, 20));
		System.out.println("정수 min : " + Integer.min(10, 20));
		
		// 기본형과 참조형(wrapper) 서로 쉽게 호환되도록 지원
		int n = 10;
		Integer n2 = 10; // 참조형 = 기본형 <====오토 박싱
		int n3 = n2; // 기본형 = 참조형 <==== 오토 언박싱

	}

}
