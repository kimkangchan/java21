package exam07_배열;

public class ArrayTest01_1차원배열5 {

	public static void main(String[] args) {

		// 실습 1 : 재공된 배열의 총합 구하시오
		int[] num = { 1, 2, 3, 4, 5 };

		int sum = 0;
		for (int n : num) {
			sum += n;
		}
		System.out.println("총합 : " + sum);

		// 실습 2 : 제공된 이름 중에서 글자수가 2글자인 인원수 출력
		String[] name = { "홍길동", "세조", "정조", "단종", "박혁거제" };
		int count = 0;
		String msg = "";
		for (String s : name) {
			if (s.length() == 2) {
				count += 1;
				msg += s;
			}
		}
		System.out.println("인원수 : " + count);
		System.out.println("이름 :\t" + msg);

	}

}
