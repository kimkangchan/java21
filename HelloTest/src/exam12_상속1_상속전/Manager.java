package exam12_상속1_상속전;

//매니저
public class Manager {

	String name;
	int salary;
	String depart; // 관리 부서

	public Manager() {

	}

	public Manager(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}

	// getter
	// setter

	public String getManger() {
		return name + "\t" + salary + "\t" + depart;
	}

}
