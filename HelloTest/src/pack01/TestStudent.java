package pack01;

public class TestStudent {

	public static void main(String[] args) {

		Student s1 = new Student("Kim", 100, 90, 95, 89);
		Student s2 = new Student("Lee", 60, 70, 99, 98);
		Student s3 = new Student("Park", 68, 86, 60, 40);
		
		s1.getGrade();
		s2.getGrade();
		s3.getGrade();

	}

	

}
