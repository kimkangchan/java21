package exam09_class2_construct;

public class Cat { // 고양이 객체

	String name;
	int age;
	String gender;

	public void eat() {
		System.out.println("쩝쩝");
	}

	public void cry() {
		System.out.println("어흥");
	}

	// 3. 생성자
	// 오버로딩(overloading) 생성자

	public Cat() {
	}

	public Cat(String s) {
		name = s;
	}

	public Cat(String s, int n) {
		name = s;
		age = n;
	}

	public Cat(String s, int n, String s2) {
		name = s;

		// age 검증가능
		if (n >= 20) {
			System.out.println("나이값 오류. 확인하세요");
		} else {
			age = n;
		}
		gender = s2;

	}
}
