package exam11_static;

class Count{
	
	int num;
	static int count;
	public Count() {
		num ++;
		count ++;
	}
}

public class StaticTest2 {

	public static void main(String[] args) {
		
		System.out.println(Count.count);
		
		//Count를 객체생 시 생성횟수를 카운트하자
		Count c = new Count();
		System.out.println(Count.count);
		Count c2 = new Count();
		System.out.println(Count.count);
	}

}
