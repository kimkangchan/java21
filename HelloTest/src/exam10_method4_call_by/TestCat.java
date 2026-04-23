package exam10_method4_call_by;

class Cat {
	String name;
	int age;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

}

class Student {

}

public class TestCat {

	// call by value : 인자값이 기본형
	public static void pdt(int n) { // static 을 지정하면 객체생성 없이 메서드 호출 가능
		n = 20;
	}

// call by reference : 인자값이 참조형
	public static void rdt(Cat c) {
		c.age = 20;
	}

	public static void main(String[] args) {

		Cat c = new Cat("야옹", 2);
		System.out.println("변경 전 : " + c.age);
		rdt(c);
		System.out.println("변경 후 : " + c.age);		
		
		// call by value 실습
		int num = 10;
		System.out.println("변경 전 : " + num);
		pdt(num);
		System.out.println("변경 후 : " + num);
	}

}
