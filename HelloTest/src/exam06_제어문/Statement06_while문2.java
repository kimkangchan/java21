package exam06_제어문;

import java.util.Scanner;

public class Statement06_while문2 {

	public static void main(String[] args) {

		// 무한 루프(언제든지 빠져나올 수 있는 로직 제공해야함)

		while (true) {
			// 무한 루프(언제든지 빠져나올 수 있는 로직 제공해야함)
			Scanner sc = new Scanner(System.in);
			System.out.println("===============");
			System.out.println("1.이름입력");
			System.out.println("2.나이입력");
			System.out.println("3.quit");
			System.out.println("===============");

			int num = sc.nextInt();

			if (num == 1) {
				System.out.println("이름을 입력하세요");
				String name = sc.next();
				System.out.println("당신의 이름은 : " + name);
			} else if (num == 2) {
				System.out.println("나이를 입력하세요");
				int age = sc.nextInt();
				System.out.println("당신의 나이 : " + age);
			} else {
				System.out.println("종료");
				System.exit(0);
			}
	
		}
	}

}
