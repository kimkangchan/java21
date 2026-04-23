package exam12_상속6_다형성;

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

	@Override
	public String toString() {
		return "Manager [depart=" + depart + ", name=" + name + ", salary=" + salary + "]";
	}

	

	

}
