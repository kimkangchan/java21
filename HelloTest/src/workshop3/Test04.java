package workshop3;

public class Test04 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = 6; j >= 1; j--) {
				int sum = 0;
				sum = i + j;
				if (sum == 6) {
					System.out.printf("%d + %d = %d\n", i, j, i + j);
				}
			}
		}
	}

}
