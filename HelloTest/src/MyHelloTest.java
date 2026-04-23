// default 패키지
import p1.MyHello;
public class MyHelloTest {

	public static void main(String[] args) {
		
		p1.MyHello h = new p1.MyHello();
		h.method();

		p1.MyHello h2 = new p1.MyHello();
		h2.method();

		p1.MyHello h3 = new p1.MyHello();
		h3.method();
		
		MyHello h4 = new MyHello();
		h4.method();
		MyHello h5 = new MyHello();
		h5.method();
	}

}
