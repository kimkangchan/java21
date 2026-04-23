package workshop4;

public class ArrayTest01 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };
		int sum  = 0;
		float avg = 0.0f;
		
		for(int s :arr) {
			sum+=s;
		}
		avg = sum/ arr.length;
		
		System.out.println("sum = "+sum);
		System.out.println("avg = "+avg);
		
	}

}
