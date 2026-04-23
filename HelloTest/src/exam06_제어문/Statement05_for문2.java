package exam06_제어문;

public class Statement05_for문2 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			System.out.println("hello" + i);
		}
		System.out.println("=====================");

		for (int i = 10; i > 5; i--) {
			System.out.println("hello" + i);
		}

		System.out.println("=====================");

		for (int i = 0; i < 10; i += 2) {
			System.out.println("hello" + i);
		}

		System.out.println("=====================");

		for (int i = 0, j = 1; i < 10 && j < 4; i++, j++) {
			System.out.println("hello" + i);
		}

		System.out.println("=====================");
		for (int i = 0; i < 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.println("hello"+j);
			}
		}

	}

}
