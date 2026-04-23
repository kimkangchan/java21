package workshop4;


public class ArrayTest05 {

	public static void main(String[] args) {
		int[][] arr2 = { { 20, 30, 10 }, { 50, 40, 60 }, { 80, 80, 90 } };

		for (int i = 2; i >= 0; i--) {
			for (int j = 2;j>=0;j--) {
				System.out.printf("%d ",arr2[i][j]);
			}
		}
	}

}
