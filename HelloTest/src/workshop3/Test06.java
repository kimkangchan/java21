package workshop3;

public class Test06 {

	public static void main(String[] args) {

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				for (int k = 1; k <= 6; k++) {
					int cal = 1;
					cal = i * j * k;
					if (cal % 3 == 0) {
						System.out.printf("%d * %d * %d = %d\n", i, j, k, cal);
					}
				}
			}
		}

	}

}
