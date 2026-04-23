package exam14_인터페이스2_추상클래스적용전;

//Cat, Dog, Bird 의 공통적인 속성과 동작 정의
public class Pet {
	
	//공통적인 속성
	String name;
	int age;
	
	
	public Pet() {
		
	}
	
	public Pet(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//공통적인 기능
	public void eat() {
		
	}
	public void sleep() {
		
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", age=" + age + "]";
	}
	
	//getter/setter 메서드 추가 가능
}
