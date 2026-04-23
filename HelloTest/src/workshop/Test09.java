package workshop;

import java.util.Scanner;
public class Test09 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.정수를 입력하세요.");
		int i = scan.nextInt();
		
		System.out.println("2.정수를 입력하세요.");
		int j = scan.nextInt();
		
		int max = i > j ? i : j ;
		
		System.out.printf("정수 %d과 정수 %d 중에서 최대값 : %d",i,j,max);
	
		scan.close();
	}

}
