package workshop4;

import java.util.Arrays;
import java.util.Scanner;


public class ArrayTest06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int []arr;
		
		
		System.out.println("키의 최댓값을 구합니다.");
		System.out.printf("사람 수 : ");
		int num = sc.nextInt();
		arr = new int[num];
		
		for(int i = 0; i <num;i++) {
			System.out.printf("사람 %d : ",i+1);
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		System.out.printf("최대값은 %d 입니다.",arr[num-1]);
		
		sc.close();
	}

}
