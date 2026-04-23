package exam12_상속6_다형성;

public class TestEmployee4 {

	// 기본형 데이터를 저장하는 파라미터를 가진 메서드
	static public void method(double d) {

	}

	// 참조형 데이터를 저장하는 파라미터를 가진 메서드 (Employee 한정)
	static public void method2(Employee e) {

	}

	// 참조형 데이터를 저장하는 파라미터를 가진 메서드 (모든 데이터)
	static public void method3(Object obj) {

	}

	public static void main(String[] args) {

		// 다형성이 적용된 방식
		// 2. 메서드 파라미터 타입

		// 기본형
		method(10);
		method(3.14F);
		method(3.14D);

		method2(new Employee("홍길동", 2000));
		method2(new Engineer("이순신", 4300, "자바"));
		method2(new Manager("유관순", 4000, "관리"));

		method3(10);
		method3("hello");
		method3(3.14F);
		method3(true);
		method3(new Employee("홍길동", 2000));
	}

}
