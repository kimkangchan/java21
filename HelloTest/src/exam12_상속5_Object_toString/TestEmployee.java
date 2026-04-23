package exam12_상속5_Object_toString;

public class TestEmployee {

	public static void main(String[] args) {

		Manager m = new Manager("홍길동", 2000, "인사");
		Engineer e = new Engineer("유관순", 1800, "자바");
		System.out.println(m);
		// System.out.println(m.getEmployee());

		// System.out.println(m.toString()); //Object 에 있는 toString
	}

}
