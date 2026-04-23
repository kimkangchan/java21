package exam16_람다표현식;

//인터페이스
@FunctionalInterface
interface Flyer4 {
	public abstract String fly();
}

public class TestMain4 {

	public static void main(String[] args) {
		// 익명클래스
		Flyer4 f = new Flyer4() {
			@Override
			public String fly() {
				return "hello";
			}
		};
		String s = f.fly();
		System.out.println(s);
		

		// 람다 표현식
		Flyer4 f2 = () -> {return "hello";};
		Flyer4 f3 = () -> "hello";
		
		String s2 = f2.fly();
		String s3 = f3.fly();
		
		System.out.println(s2);
		System.out.println(s3);

	}
}
