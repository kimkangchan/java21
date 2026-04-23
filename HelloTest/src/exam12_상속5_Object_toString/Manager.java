package exam12_상속5_Object_toString;

//매니저
//Manager is a Employee
public class Manager extends Employee {

	String depart; // 관리 부서

	public Manager() {
		super();
	}

	public Manager(String name, int salary) {
		super(name, salary);
	}

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

	// 오버라이딩 - generate 방법 이용
	@Override
	public String getEmployee() {
		// return name + "\t" + salary + "\t" + depart;
		return super.getEmployee() + "\t" + depart; // super.은 부모를 호출!!!
	}
	// Object 의 toString 재정의
	@Override
	public String toString() {
		// return super.toString();
		return super.getEmployee() + "\t" + depart;
	}

	

}
