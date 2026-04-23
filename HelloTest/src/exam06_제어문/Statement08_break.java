package exam06_제어문;

public class Statement08_break {

	public static void main(String[] args) {

		for (int n = 1; n <= 5; n++) {
			if (n == 4)
				break;
			System.out.println("hello");
		}
		System.out.println("end");

	}

}
