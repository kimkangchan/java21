package exam12_상속3_super;

//매니저
//Manager is a Employee
public class Manager extends Employee {

	String depart; // 관리 부서

	// 생성자 작성을 generate 으로......

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

	public String getManger() {
		return name + "\t" + salary + "\t" + depart;
	}
}
