package exam17_유틸리티;

class Calender2 {
	private static Calender2 cal;

	private Calender2() {
	}

	public static Calender2 getInstance() {
		if (cal == null)
			new Calender2();
		return cal;
	}
}

public class SingleTonDesignTest {

	public static void main(String[] args) {
		// 싱글톤 디자인 패턴 : 단 하나의 인스턴스만 만들 때 사용 ex. 지구, 대한민국

		Calender2 cal = Calender2.getInstance();
		Calender2 cal2 = Calender2.getInstance();

		System.out.println(cal == cal2);// true
	}

}
