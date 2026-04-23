package workshop3;

import java.util.Scanner;

public class Test12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int num = 0;
		System.out.println(" 양의 자릿수 구하기");
		do {
			System.out.print("정수값 : ");
			num = sc.nextInt();
		} while (num < 0);

		System.out.println("그 수는 " + String.valueOf(num).length() + "자리 입니다.");
		
		sc.close();
	}
}
