package exam02_변수;

public class VariableTest04_변수특징 {
	 
	// 인스턴스 변수
	int num; //heap 메모리
	public static void main(String[] args) {
		
		//변수명 중복 불가
		int num = 10; //로컬 변수
//		int num = 20; 
//		long num = 20;
		
		//로컬변수는 사용전에 반드시 초기화
		int size;
		//System.out.println(size);
		
		//블록 scope : 블록 내에서 선언된 변수는 블럭 밖에서 사용불
		{
			int age = 20;
		System.out.println(age);
		}
		{
			int age = 30; // 블럭이 다르면 변수면 동일 가능
		System.out.println(age);
		}
		// System.out.println(age);
	} // main 매서드 블럭

} // 클래스 블
