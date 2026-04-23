package exam12_상속5_Object_toString;

//엔지니어
//Engineer is a Employee
public class Engineer extends Employee {

	String skill; // 엔지니어의 기술

	public Engineer() {
		super();
	}

	public Engineer(String name, int salary) {
		super(name, salary);
	}

	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}

	// getter
	// setter

//	public String getEngineer() {
//		return name + "\t" + salary + "\t" + skill;
//	}

	// 오버라이딩 적용
	@Override
	public String getEmployee() {
		return super.getEmployee() + "\t" + skill;
	}

}
