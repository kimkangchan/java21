package workshop3;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("세 정수의 최대값 구하기");
		System.out.print("a 값 : ");
		int a = sc.nextInt();

		System.out.print("b 값 : ");
		int b = sc.nextInt();

		System.out.print("c 값 : ");
		int c = sc.nextInt();

		if (a > b && a > c) {
			System.out.println("최대값 : " + a);
		} else if (b > a && b > c) {
			System.out.println("최대값 : " + b);
		} else {
			System.out.println("최대값 : " + c);
		}
		
		sc.close();
	}

}
