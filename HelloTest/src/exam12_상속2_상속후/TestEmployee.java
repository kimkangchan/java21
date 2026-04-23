package exam12_상속2_상속후;

public class TestEmployee {

	public static void main(String[] args) {

		Manager m = new Manager("홍길동", 2000, "인사");
		Engineer e = new Engineer("유관순", 1800, "자바");

		System.out.println(m.getManger());
		System.out.println(e.getEngineer());
		
		//원래 수정은 setter 메서드 사
		m.salary = 3000;
		System.out.println(m.name + "\t" + m.salary + "\t" + m.depart);
	}

}
