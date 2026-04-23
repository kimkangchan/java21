package pack01;

public class Student {

	private String name;
	private int korean;
	private int english;
	private int math;
	private int science;

	public Student() {

	}

	public Student(String name, int korean, int english, int math, int science) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
		this.science = science;
	}

	public double getAvg() {
		return (korean + english + math + science) / 4.0;

	}

	public String setGrade() {
		double avg = getAvg();
		String result = "";
		if(avg>90) {
			result = "A";
		} else if( avg >=70 && avg < 90) {
			result= "B";
		}else if(avg >= 50 && avg <70) {
			result = "C";
		}else if(avg >= 30 && avg <50) {
			result = "D";
		}else {
			result = "D";
		}
		return result;
	}
	
	public void getGrade() {
		System.out.println(name + " 평균: " + getAvg() + " 학점: " + setGrade());
	}
}
