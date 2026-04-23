package exam06_제어문;

public class Statement04_switch {

	public static void main(String[] args) {

		int num = 10;

		switch (num) {
		case 5:
			System.out.println("5");
			break;
		case 10:
			System.out.println("10");
			break;
		case 15:
			System.out.println("15");
			break;
		case 20:
			System.out.println("20");
			break;
		default:
			System.out.println("default");
		} // end switch

		String name = "A";
		switch (name) {
		case "A":
			System.out.println("A");
			break;
		case "B":
			System.out.println("B");
			break;
		case "C":
			System.out.println("C");
			break;
		}
	}

}
