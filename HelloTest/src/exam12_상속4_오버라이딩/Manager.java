package exam12_상속4_오버라이딩;

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


	// getter
	// setter

	// public String getManger() {
	// return name + "\t" + salary + "\t" + depart;
	// }

	// 오버라이딩 - generate 방법 이용
	@Override
	public String getEmployee() {
		// return name + "\t" + salary + "\t" + depart;
		return super.getEmployee() + "\t" + depart; // super.은 부모를 호출!!!
	}

}
