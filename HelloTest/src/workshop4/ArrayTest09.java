package workshop4;

import java.util.Random;

public class ArrayTest09 {

	public static void main(String[] args) {
		int[] arr3 = new int[5];
		int sum = 0;
		double avg = 0.0;

		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			arr3[i] = r.nextInt(10) + 1;
			System.out.printf("%d  ", arr3[i]);
			sum += arr3[i];
		}
		avg = (double) sum / 5;
		System.out.println("sum = " + sum);
		System.out.println("avg = " + avg);

	}

}
