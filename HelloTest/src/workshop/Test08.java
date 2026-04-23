package workshop;

import java.util.Scanner;
public class Test08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.정수를 입력하세요.");
		int i = scan.nextInt();
		
		System.out.println("2.정수를 입력하세요.");
		int j = scan.nextInt();
		
		int sum = i + j;
		
		System.out.printf("정수 %d과 정수 %d의 합계 : %d",i, j, sum);
		
	
		scan.close();
	}

}
