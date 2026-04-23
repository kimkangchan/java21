package exam21_함수적인터페이스;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

/*
@FunctionalInterface
public interface Predicate<T>{
  boolean test(T t);   
} 

*/

public class PredicateTest {

	public static void main(String[] args) {

		Predicate<String> p = new Predicate<String>() {

			@Override
			public boolean test(String t) {

				return t.length() == 3; // 전달된 파라미터 글자수 3개냐?
			}
		};
		boolean result = p.test("홍길동");
		System.out.println(result);

		Predicate<String> p2 = t -> t.length() == 3;
		boolean r2 = p.test("홍길동");
		System.out.println(r2);
		
		
		
		
		BiPredicate<String, Integer> p3 = new BiPredicate<String, Integer>() {
			
			@Override
			public boolean test(String s, Integer n) {
				return s.charAt(n) == '홍'; //(문자열, 문자열의 위치값) ex. "홍길동",0 -> ㅐ전달해서 0번째 글자가 홍이냐?
			}
		};
		boolean r3 = p3.test("홍길동", 0);
		System.out.println(p3);
		
		
		BiPredicate<String, Integer> p4 = (s,n) -> s.charAt(n) == '홍';
		
		boolean r4 = p4.test("홍길동", 0);
		System.out.println(p4);
	}

}
