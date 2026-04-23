package exam14_인터페이스3_인터페이스적용후;

public class Bird extends Pet implements Flyer {

	public Bird() {

	}

	public Bird(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
	}

	@Override
	public void sleep() {
	}

	@Override
	public void fly() {

	}
}
