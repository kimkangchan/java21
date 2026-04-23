package workshop3;

import java.util.Scanner;

public class Test13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("2자리 정수를 입력하세요.");

		do {
			System.out.print("입력 : ");
			num = sc.nextInt();

		
		} while (num < 10 || num > 99);

		System.out.println("입력값은 " + num);

		sc.close();
	}
}
