package workshop3;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("정수를 입력하시오");
		int num = sc.nextInt();
		int sum = 0;
		float avg = 0.0f;
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sum+=i;
				count+=1;
			}
		}
		avg = (float)(sum /count);
		
		System.out.printf("총합 : %d \n평균값 : %.1f",sum,avg);
		
		sc.close();
		
	}

}
