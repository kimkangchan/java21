package exam10_method2;

public class Cat {

	// 은닉화(캡슐화)
	private String name;
	private int age;
	private String gender;

	// 생성자
	public Cat() {

	}

	public Cat(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	// 메서드
	// name에 해당되는 setter와 getter메서드 추가
	// setter : set+변수명(관례), camel표기법 권장
	public void setName(String name) {
		this.name = name;
	}

	// getter : get+변수명(관례), camel표기법 권장
	public String getName() {
		return name; // this.name
	}

	// age
	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age; // this.age
	}

	// gender
	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender; // this.gender
	}

}
