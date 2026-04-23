package exam09_class3_this;

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

	public Cat() {

	}

	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public Cat(String name, int age) {
		this(name, age, null);
//		this.name = name;
//		this.age = age;
	}

}
