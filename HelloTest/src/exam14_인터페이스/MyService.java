package exam14_인터페이스;

public interface MyService {
	public static final int NUM = 20;
	int SIZE = 30; // public static final 자동지정
	
	//2.추상 메서드
	public abstract void a();
	void b(); //public abstract 자동 지정
	
	//3. default 메서드
	public default void c() {
		System.out.println("default c()");
		
	}
	//static 메서드
	public static void d() {
		System.out.println("static d()");
	}

}
