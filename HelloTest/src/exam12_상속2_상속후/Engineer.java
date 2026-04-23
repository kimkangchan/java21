package exam12_상속2_상속후;

//엔지니어
//Engineer is a Employee
public class Engineer extends Employee {

	String skill; // 엔지니어의 기술

	public Engineer() {

	}

	public Engineer(String name, int salary, String skill) {
		super(name, salary); //명시적 호출
		System.out.println("Engineer 생성자");
//		this.name = name;
//		this.salary = salary;
		this.skill = skill;
	}

	// getter
	// setter

	public String getEngineer() {
		return name + "\t" + salary + "\t" + skill;
	}

}
