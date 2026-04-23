package exam22_StreamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest4_최종처리2 {

	public static void main(String[] args) {
		// 최종처리
		Student3[] stuArr = { new Student3("홍길동", 100), new Student3("이순신", 90), new Student3("유관순", 50),
				new Student3("강감찬", 70), new Student3("정조", 95), new Student3("선덕여왕", 45) };

		Stream.of(stuArr).forEach(System.out::println);

		// 1.최종처리 - 이름만 추출해서 list로 반환
		Function<Student3, String> f3 = Student3::getName;
		Stream<String> stream = Stream.of(stuArr).map(f3);
		// stream.collect(Collector) <- collector 변수 = Collectors 메서드
		List<String> names = stream.collect(Collectors.toList());
		System.out.println("이름만 추출해서 list로 반환 : " + names);
		
		// 2.최종처리 - 이름만 추출해서 Set으로 반환
		Set<String> setNames = Stream.of(stuArr).map(f3).collect(Collectors.toSet());
		System.out.println("이름만 추출해서 Set으로 반환 : " + setNames);
		
		// 3. 최종처리 - 갯수
		long count = Stream.of(stuArr).collect(Collectors.counting());
		System.out.println("갯수 : " + count);
		
		//4.전체합계
		long sum = Stream.of(stuArr).collect(Collectors.summingInt(Student3::getGrade));
		System.out.println("전체합계 : " + sum);
		
		//5.최댓값
		Optional<Student3> max = Stream.of(stuArr).collect(Collectors.maxBy(Comparator.comparing(Student3::getGrade)));
		Student3 maxStud = max.get();
		System.out.println("최대 " + maxStud);
		
		//6.최소값
		Optional<Student3> min = Stream.of(stuArr).collect(Collectors.minBy(Comparator.comparing(Student3::getGrade)));
		Student3 minStud = min.get();
		System.out.println("최소 " + minStud);
	}
}

class Student3 {
	String name;
	int grade;

	public Student3() {

	}

	public Student3(String name, int grade) {
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
		return "student [name=" + name + ", grade=" + grade + "]";
	}

}
