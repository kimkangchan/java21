package exam06_제어문;

public class Statement05_for문4_실습 {

	public static void main(String[] args) {
		// 1. 1~20까지 반복하는데 2의 배수만 출력하시오.
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("=================");
		// 2. 1~20까지 반복하는데 3의 배수만 출력하시오.
		for (int i = 1; i <= 20; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("=================");
		// 3. 1~20까지 반복해서 총합을 출력하시오.

		int sum = 0;
		for (int i = 1; i <= 20; i++) {
			sum += i;

		}
		System.out.println(sum);

		System.out.println("=================");
		// 4. 1~20까지 반복해서 짝수값의 총합을 출력하시오

		int sum2 = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
				sum2 += i;
			}
		}
		
		System.out.println(sum2);

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}
	}

}
