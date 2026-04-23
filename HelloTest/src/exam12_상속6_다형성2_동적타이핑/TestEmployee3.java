package exam12_상속6_다형성2_동적타이핑;

public class TestEmployee3 {
	
	public static void method(Employee e) {
			if(e instanceof Manager) {
				((Manager)(e)).b();
		}
	}

	public static void main(String[] args) {

		method(new Manager());
		method(new Engineer());
		method(new Engineer());
		method(new Manager());
		method(new Manager());
	}

}
