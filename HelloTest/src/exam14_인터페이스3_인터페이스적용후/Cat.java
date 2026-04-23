package exam14_인터페이스3_인터페이스적용후;

public class Cat extends Pet {

	String color;

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}

	@Override
	public void eat() {
	}

	@Override
	public void sleep() {
	}

	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}

}
