package exam06_제어문;

public class Statement05_for문3 {

	public static void main(String[] args) {
		
		// 한번도 실행 안
		for (int n = 0; n > 4; n++) {
			System.out.println("hello" + n);
		}
		//무한루프
		for (int n = 0; ;n++) {
			System.out.println("hello" + n);
		}

	}

}
