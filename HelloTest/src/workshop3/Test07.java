package workshop3;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("한 자리 정수값을 입력하시오 ");
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % num == 0) {
				if (sum != 0) {
					System.out.print("+");
				}
				System.out.print(i);
				sum += i;
			}
		}
		System.out.print(" = " + sum);
		sc.close();
	}

}
