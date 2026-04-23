package exam11_static2;

public class Cat {

	private String name;
	private int age;
	private String gender;

	public Cat() {
		// TODO Auto-generated constructor stub
	}

	public Cat(String name, int age, String gender) {
		this.name = name;
		if (ValidClass.ageValidCheck(age)) {
			System.out.println("나이값이 잘못됐습니다!");
		} else {
			this.age = age;
		}
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if (ValidClass.ageValidCheck(age)) {
			System.out.println("나이 수정 오류발생");
		} else {
			this.age = age;
		}
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	// 필요시 메서드 추가 가능!
	// age 를 검증하는 메서드 추가
//	private boolean ageValidCheck(int age) {
//		boolean result = false;
//		if (age >= 20) {
//			result = true;
//		}
//		return result;
//
//	}

	private boolean ageValidCheck2(int age) {

		if (age >= 20) {
			return true; // return 값을 두번 쓰는 거는 비 추천! 위에 방법 권장
		} else {
			return false;
		}
	}
}
