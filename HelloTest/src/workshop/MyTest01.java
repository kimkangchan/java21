package workshop;

public class MyTest01 {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 20;
		String addr = "서울";
		
		
		System.out.println("이름은 " + name + "\n" + "나이는 " + age + "이고 주소는 " + addr);
		System.out.print("이름은 " + name + "\n" + "나이는 " + age + "이고 주소는 " + addr + "\n");
		System.out.printf("이름은 %s \n나이는 %d이고 주소는 %s \n", name, age, addr);
	}

}
