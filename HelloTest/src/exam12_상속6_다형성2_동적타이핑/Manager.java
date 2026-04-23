package exam12_상속6_다형성2_동적타이핑;

//매니저
//Manager is a Employee
public class Manager extends Employee {
	
	String name;
	@Override
	public void a() {
		System.out.println("Manager a()");
	}
	
	public void b() {
		System.out.println("Manager b()");
	}
}
