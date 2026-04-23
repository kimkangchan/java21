package exam21_함수적인터페이스;

import java.util.function.Function;

/*
@FunctionalInterface
public interface Function<T,R>{
  R apply(T t);   // public abstract R apply(T t); 동일
} 

*/
public class FunctionTest1 {

	public static void main(String[] args) {

		// Function 인터페이스 사용
		// 익명 클래스
		Function<String, Integer> f = new Function<String, Integer>() {

			@Override
			public Integer apply(String s) {

				return s.length();
			}
		};
		int n = f.apply("hello");
		System.out.println("Function : " + n);

		// 람다 표현식
		Function<String, Integer> f2 = s -> s.length();
		int n2 = f2.apply("hello");
		System.out.println("람다.Function : " + n);
		System.out.println("=================================");
		
		

	}

}
