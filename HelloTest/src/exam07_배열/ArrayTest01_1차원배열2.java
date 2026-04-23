package exam07_배열;

public class ArrayTest01_1차원배열2 {

	public static void main(String[] args) {

		// 이름을 배열로 관리 : 홍길동, 이순신, 유관순
		String[] n;
		n = new String[3];

		n[0] = "홍길동";
		n[1] = "이순신";
		n[2] = "유관순";

		for (int i = 0; i < n.length; i++) {
			System.out.printf("n[%d] = %s\n", i, n[i]);
		}
		
				for(String i : n) {
					System.out.println(i);
				}
	}

}
