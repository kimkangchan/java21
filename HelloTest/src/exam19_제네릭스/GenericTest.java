package exam19_제네릭스;

class Box {
	Object obj;

	public void setValue(Object obj) {
		this.obj = obj;
	}

	public Object getValue() {
		return obj;
	}
}

public class GenericTest {

	public static void main(String[] args) {
		
		//Box에 데이터 저장
		Box box1 = new Box();
		box1.setValue("홍길동");
		System.out.println(box1.getValue());
		box1.setValue(10);
		System.out.println(box1.getValue());
		
		//이름만 저장해야하는 요구 발생
		Box box2 = new Box();
		box2.setValue("홍길동");
		box2.setValue(10);	// 잘못된 데이터가 저장될 수 있음. 이름만 저장해야 함.
							// 실행 시 체크됨 
		
		Object obj = box2.getValue();
		String s = (String)obj; //2. 반드시 형변환
		System.out.println(s + "\t" + s.length());
	}
}
