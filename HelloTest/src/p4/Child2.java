package p4;

import p3.Parent2;

public class Child2 {

	public void method() {

		Parent2 p = new Parent2();
		System.out.println(p.n1);
//		System.out.println(p.n2); //public 제외 접근 불
//		System.out.println(p.n3);
		//System.out.println(p.n4); // private 접근 불가

	}

}


class Child3 extends Parent2 {
	public void method() {

		System.out.println(n1);
		System.out.println(n2);
//		System.out.println(n3);
		//System.out.println(n4); // private 접근 불
	}
}