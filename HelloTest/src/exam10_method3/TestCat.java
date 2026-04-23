package exam10_method3;

public class TestCat {

	public static void main(String[] args) {

		Cat c = new Cat("야옹이", 200, "수컷");

		// c.name = "춘식" 불가!!!
		c.setName("춘식");
		c.setAge(300);
		c.setGender("암컷");
		
		
		String name = c.getName();
		int age = c.getAge();
		String gender = c.getGender();
		
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
	}

}
