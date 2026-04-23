package exam22_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class StreamTest3_중간처리2 {

	public static void main(String[] args) {

		// 중간처리5 - 정렬 (sorted)
		List<Integer> list = Arrays.asList(5, 100, 42, 57, 2, 1);
		list.stream().sorted().forEach(System.out::println);
		System.out.println("==============================");

		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		System.out.println("==============================");
		
		List<Student2> list2 = Arrays.asList(new Student2("홍길동", 100), 
											new Student2("이순신", 90), 
											new Student2("유관순", 50),
											new Student2("강감찬", 70), 
											new Student2("정조", 95), 
											new Student2("선덕여왕", 45));
		
		// 정렬할 값을 알려줘야함
		Function<Student2, Integer> f = new Function<Student2, Integer>() {
			
			@Override
			public Integer apply(Student2 stu) {
				
				return stu.getGrade(); // grade 값으로 정렬
			}
		};
		list2.stream()
		.sorted(Comparator.comparing(f)) //오름차순
		.forEach(System.out::println);
		System.out.println("==============================");
		
		list2.stream()
		.sorted(Comparator.comparing(f,Comparator.reverseOrder())) //오름차순
		.forEach(System.out::println);
		System.out.println("==============================");
		
		//중간처리6 - skip
		list2.stream()
		.skip(2)
		.forEach(System.out::println);
		System.out.println("==============================");
		
		//중간처리7 - limit
		list2.stream()
		.limit(4)
		.forEach(System.out::println);
		System.out.println("==============================");
	}

}

class Student2 {
	String name;
	int grade;

	public Student2() {

	}

	public Student2(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "student2 [name=" + name + ", grade=" + grade + "]";
	}
}
