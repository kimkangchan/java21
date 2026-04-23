package workshop;

import java.util.Scanner;
public class Test11 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1.정수를 입력하시오.");
		int i = scan.nextInt();
		
		System.out.println("2.정수를 입력하시오.");
		int j = scan.nextInt();
		
		System.out.println("3.정수를 입력하시오.");
		int k =scan.nextInt();
		
		int max = (i > j)?(i > k ? i : k):(j > k ? j:k); 
		
		System.out.printf("정수 %d과 정수 %d, 정수 %d 중에서 최대값 : %d",i,j,k,max);
		scan.close();
	}

}
