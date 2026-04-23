package exam12_상속2_상속후;

//매니저
//Manager is a Employee
public class Manager extends Employee{

	String depart; // 관리 부서

	public Manager() {

	}

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		System.out.println("Manager 생성자");
//		this.name = name;
//		this.salary = salary;
		this.depart = depart;
	}

	// getter
	// setter

	public String getManger() {
		return name + "\t" + salary + "\t" + depart;
	}

}
