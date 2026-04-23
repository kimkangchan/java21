package exam12_상속6_다형성;

public class TestEmployee2 {

	public static void main(String[] args) {

		// 다형성이 적용 안된 방식
		Employee e = new Manager("홍길동", 2000, "인사");
		System.out.println(e);
		e = new Engineer("유관순", 1800, "자바");
		System.out.println(e);

	}

}
