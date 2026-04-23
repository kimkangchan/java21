package exam06_제어문;

import java.util.Scanner;

public class Statement03_다중if문 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("당신의 점수를 입력하세요 : ");
		int num = sc.nextInt();

		if (num >= 90) {
			System.out.println("A 학점");
		} else if (num >= 80) {
			System.out.println("B 학점");
		} else if (num >= 70) {
			System.out.println("C 학점");
		} else {
			System.out.println("F 학점");
		}
		
		/*
		if (num >= 90 && num <= 100) {
			System.out.println("A 학점");
		} else if (num >= 80 && num <= 89) {
			System.out.println("B 학점");
		} else if (num >= 70 && num <= 79) {
			System.out.println("C 학점");
		} else {
			System.out.println("F 학점");
		}
		*/
		sc.close();
	}

}
