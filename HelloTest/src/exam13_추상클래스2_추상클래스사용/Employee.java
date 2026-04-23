package exam13_추상클래스2_추상클래스사용;

public abstract class Employee {
	String name;
	int salary;

	public Employee(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}

	// name 과 salary 를 리턴하는 메서드가 필요하다고 order가 옴
	public abstract String getEmployee();

}
