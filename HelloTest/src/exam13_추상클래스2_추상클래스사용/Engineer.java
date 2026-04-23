package exam13_추상클래스2_추상클래스사용;

public class Engineer extends Employee {

	String skill;

	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}
	
	@Override
	public String getEmployee() {
		return skill + "\t" + name + "\t" + salary;
	}
}
