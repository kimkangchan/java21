package workshop3;

import java.util.Scanner;

public class Test16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("왼쪽 위가 직각인 삼각형을 출력합니다.");
		System.out.print("몇 단 삼각형입니까? : ");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		sc.close();
	}
}
