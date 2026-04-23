package exam07_배열;

public class ArrayTest02_2차원배열3 {

	public static void main(String[] args) {

		// 2차원 배열 비정방형

	
		int [][] num;
		
		//행과 열 생성
		num = new int[3][];
		
		num[0] = new int[1];
		num[1] = new int[2];
		num[2] = new int[3];

		
		num[0][0] = 1;
		num[1][0] = 2;
		num[1][1] = 3;
		num[2][0] = 4;
		num[2][1] = 5;
		num[2][2] = 6;

		// 5. 출력
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
		
		System.out.println("행의 길이" + num.length);
		System.out.println("1행의 열길이" + num[0].length);
		System.out.println("2행의 열길이" + num[1].length);
		System.out.println("3행의 열길이" + num[2].length);
		
	}

}
