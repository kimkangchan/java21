package exam13_추상클래스;

public class AbstractClassTest {

	public static void main(String[] args) {
		// 직접 추상클래스 객체생성 불가
		// AbstractClass a = new AbstractClass();
		// 자식 클래스를 이용해 추상 클래스의 구성요소 사용됨.
		AbstractChildClass a = new AbstractChildClass();
		
		System.out.println(a.num);
		a.a();
		a.b();
		a.c();
	}

}
