package exam19_제네릭스;

class Box2<T> {
	T obj;

	public void setValue(T obj) {
		this.obj = obj;
	}

	public T getValue() {
		return obj;
	}
}

public class GenericTest2_suepr_extends {

	public static void main(String[] args) {

		// Box에 데이터 저장
		Box2 box1 = new Box2();
		box1.setValue("홍길동");
		System.out.println(box1.getValue());
		box1.setValue(10);
		System.out.println(box1.getValue());

		// 문자열만 저장 요구사항
		Box2<String> box2 = new Box2<String>();
		box2.setValue("홍길동");
		// box3.setValue(10);
		String s = box2.getValue();
		System.out.println(s);

		// 정수만 저장
		Box2<Integer> box3 = new Box2<Integer>();
		box3.setValue(10);
		int n = box3.getValue();
		System.out.println(n);
	}
}
