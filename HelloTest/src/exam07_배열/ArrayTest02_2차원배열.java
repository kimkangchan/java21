package exam07_배열;

public class ArrayTest02_2차원배열 {

	public static void main(String[] args) {

		// 2차원 배열

		// 1,배열선언
		int[][] num;

		// 2. 행 생성
		num = new int[2][];

		// 3. 열생성 (자동초기화)
		num[0] = new int[2];
		num[1] = new int[2];

		System.out.println(num[0][0]);
		System.out.println(num[0][1]);
		System.out.println(num[1][0]);
		System.out.println(num[1][1]);
		
		num[0][0] = 1;
		num[0][1] = 2;
		num[1][0] = 3;
		num[1][1] = 4;

		// 5. 출력
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[1].length; j++) {
				System.out.println(num[i][j]);
			}
		}
		System.out.println("=========================");
		for (int[] n : num) { // 행 반복
			for (int x : n) { // 열 반복
				System.out.println(x);
			}
		}
		
		System.out.println("행의 길이" + num.length);
		System.out.println("1행의 열길이" + num[0].length);
		
	}

}
