package exam16_람다표현식;

//인터페이스
@FunctionalInterface
interface Flyer {
	public abstract void fly();
}

public class TestMain {

	public static void main(String[] args) {

		// 익명클래스
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("fly()");
			}
		};
		f.fly();
		// 람다 표현식
		Flyer f2 = () -> {
			System.out.println("람다.fly()");
		};
		f2.fly();

		Flyer f3 = () -> System.out.println("람다.fly()");
		f3.fly();
	}
}
