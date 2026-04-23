package workshop4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayTest07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		int[] arr;

		System.out.println("키의 최댓값을 구합니다.");
		System.out.printf("사람 수 : ");
		int num = sc.nextInt();
		arr = new int[num];

		for (int i = 0; i < num; i++) {
			arr[i] = r.nextInt(200);
			System.out.printf("사람 %d : %d\n", i + 1,arr[i]);
		}
		Arrays.sort(arr);
		System.out.printf("최대값은 %d 입니다.", arr[num - 1]);

		sc.close();
	}

}
