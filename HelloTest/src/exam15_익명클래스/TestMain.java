package exam15_익명클래스;

public class TestMain {

	public static void main(String[] args) {

		// 다형성 적용한 이름있는 클래스
		Flyer f = new Bird();
		f.fly();

		// 다형성을 적용한 익명 클래스
		Flyer f2 = new Flyer() {
			@Override
			public void fly() {
				System.out.println("익명 클래스.fly()");
			}
			public void land() {
				System.out.println("익명 클래스.land()");
			}
		};
		f2.fly();
		f2.land();
		
		

	}
}
