package workshop3;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;

		System.out.print("a의 값 : ");
		a = sc.nextInt();

		do {
			System.out.print("b의 값 : ");
			b = sc.nextInt();
			if (b<=a) {
				System.out.println("a보다 큰값을 입력하세요!");
			}
		} while (b <= a);
		int min = b - a;
		System.out.printf("b-a는 %d입니다.", min);
		sc.close();
	}
}
