package exam14_인터페이스2_추상클래스적용전;

public class Cat extends Pet{
	
	String color;

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String color) {
		super(name, age);
		this.color = color;
	}
	public void catEat() {}
	public void catSleep() {}
	

	@Override
	public String toString() {
		return "Cat [color=" + color + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	

}
