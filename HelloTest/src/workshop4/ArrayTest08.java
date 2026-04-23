package workshop4;

import java.util.Arrays;

public class ArrayTest08 {

	public static void main(String[] args) {

		int[] score = { 99, 34, 67, 22, 11, 9 };

		Arrays.sort(score);
		int max = score[5];
		int min = score[0];

		System.out.println("최댓값 : " + max);
		System.out.println("최소값 : " + min);
	}

}
