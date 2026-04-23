package exam07_배열;

public class ArrayTest02_2차원배열4 {

	public static void main(String[] args) {
		
		// 2차원 베얄 - 2 (리터럴)
		int[][] num = { { 1, 2 }, { 3, 4 } };

		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);

		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		System.out.println("=========================");
		for (int[] n : num) { // 행 반복
			for (int x : n) { // 열 반복
				System.out.println(x);
			}
		}

		System.out.println("=========================");

		// 비정방형
		int[][] num2 = { { 1 }, { 2, 3 }, { 4, 5, 6 } };

		for (int[] n : num2) {
			for (int m : n) {
				System.out.println(m);
			}
		}
	}

}
