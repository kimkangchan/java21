package exam07_배열;

public class ArrayTest03_command_line_arguments2 {

	public static void main(String[] args) {

		// 실행할때 command line arguments 로 정수값을 입력받아서
		// 입력받은 정수 만큼 반복해서 hello 를 출력하시오.
		// int num = Integer.parseInt("10");

		String s = args[0];
		int num = Integer.parseInt(s); // "3" -------------> 3

		for (int i = 1; i <= num; i++) {
			System.out.println("hello" + i);
		}
		System.out.println("end");
	}

}
