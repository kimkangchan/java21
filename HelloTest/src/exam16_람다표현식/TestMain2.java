package exam16_람다표현식;

//인터페이스
@FunctionalInterface
interface Flyer2 {
	public abstract void fly(int n);
}

public class TestMain2 {

	public static void main(String[] args) {

		// 익명클래스
		Flyer2 f = new Flyer2() {
			@Override
			public void fly(int n) {
				System.out.println("fly()"+n);
			}
		};
		f.fly(10);
		
		// 람다 표현식
		Flyer2 f2 = (int n) -> {System.out.println("fly()"+n);}; 
		f2.fly(20);
		Flyer2 f3 = (n) -> {System.out.println("fly()"+n);};
		f3.fly(30);
		Flyer2 f4 = n -> {System.out.println("fly()"+n);};
		f4.fly(40);
		Flyer2 f5 = n -> System.out.println("fly()"+n);
		f5.fly(50);
		
	}
}
