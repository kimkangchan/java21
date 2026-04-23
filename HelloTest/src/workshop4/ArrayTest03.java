package workshop4;

public class ArrayTest03 {

	public static void main(String[] args) {
		int[][] arr2 = { { 5, 5, 5, 5, 5 }, { 10, 10, 10, 10, 10 }, { 20, 20, 20, 20, 20 }, { 30, 30, 30, 30, 30 } };
		int sum = 0;
		int count = 0;
		for (int[] i : arr2) {
			for (int j : i) {
				sum += j;
				count++;
			}
		}
		double avg = (double)sum / count;
		System.out.println("total = " + sum);
		System.out.println("average = " + avg);
	}

}
