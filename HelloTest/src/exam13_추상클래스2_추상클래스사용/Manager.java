package exam13_추상클래스2_추상클래스사용;

public class Manager extends Employee {

	String depart;

	public Manager(String name, int salary, String depart) {
		super(name, salary);
		this.depart = depart;
	}

//	public String getNameSalaryDepart() {
//		return depart + "\t" + name + "\t" + salary;
//	}
	
	@Override
	public String getEmployee() {
		return depart + "\t" + name + "\t" + salary;
	}
}
