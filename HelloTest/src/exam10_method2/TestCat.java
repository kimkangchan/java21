package exam10_method2;

public class TestCat {

	public static void main(String[] args) {

		Cat c = new Cat("야옹이", 10, "수컷");

		// c.name = "춘식" 불가!!!
		c.setName("춘식");
		String name = c.getName();

		c.setAge(3);
		int age = c.getAge();

		c.setGender("암컷");
		String gender = c.getGender();

		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}

}
