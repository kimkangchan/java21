package exam07_배열;

import java.util.Arrays;

public class ArrayTest04_Arrays_유틸리티 {

	public static void main(String[] args) {

		// 1. 베열을 문자열로 모두 출력
		int[] num = { 10, 20, 30 };
		String s = Arrays.toString(num);

		System.out.println(Arrays.toString(num)); // [10, 20, 30]

		// 2. 배열을 오름차순 정렬
		int[] num2 = { 10, 4, 68, 43, 68, 23, 45 };
		Arrays.sort(num2);
		System.out.println(Arrays.toString(num2)); // [4, 10, 23, 43, 45, 68, 68]

		// 3. 배열을 특정값으로 채우기
		String[] name = { "A", "B", "C", "D", "2", "E", "F" };
		Arrays.fill(name, "X");
		System.out.println(Arrays.toString(name)); // [X, X, X, X, X, X, X]

		// 4.배열 일부분을 특정값으로 채우기
		// 문법 : Arrays.fil(배열, 시작위치, 끝위치 -1, 변경할 값)
		String[] name2 = { "A", "B", "C", "D", "2", "E", "F" };
		Arrays.fill(name2, 0, 3, "X");
		System.out.println(Arrays.toString(name2)); // [X, X, X, D, 2, E, F]

		// 5. 배열에서 특정 요소의 위치값(index)찾기
		// Arrays.binarySearch(배열, 찾을값)
		int[] num3 = { 10, 4, 68, 43, 68, 23, 45 };
		// 정렬필수
		Arrays.sort(num3);
		System.out.println(Arrays.toString(num3)); //[4, 10, 23, 43, 45, 68, 68]
		int idx = Arrays.binarySearch(num3, 23);
		System.out.println(idx); //2

		// 6.배열비교
		// 문법 :Arrays.equals(배열1,배열2);
		int[] x = { 10, 4, 68, 43, 68, 23, 45 };
		int[] x2 = { 10, 4, 68, 43, 68, 23, 45 };
		boolean result = Arrays.equals(x, x2);
		System.out.println(result); // true
		
		
		// 7. 배열크기 변경(기존 배열크기 변경은 불가, 새로운 배열 생성 후 기존 배열값 복사)
		// 문법 : 새로운배열 = Arrays.copyOf(기존 배열, 크기)
		
		int []num4 = {8,3};
		System.out.println(Arrays.toString(num4)); // [8, 3]
		int []newArray = Arrays.copyOf(num4, 5);
		System.out.println(Arrays.toString(newArray)); // [8, 3, 0, 0, 0]
		num4 = newArray; //num4에 newArray 주소값 할
		System.out.println(Arrays.toString(num4)); // [8, 3, 0, 0, 0]
	}

}
