package exam21_함수적인터페이스;


import java.util.function.IntPredicate;


/*
@FunctionalInterface
public interface Predicate<T>{
  boolean test(T t);   
} 

*/

public class PredicateTest2_논리메소드 {

	public static void main(String[] args) {
		IntPredicate x = n -> n % 2 == 0;
		IntPredicate x2 = n -> n % 3 == 0;
		
		//1전달딘 값이 2의 배수이고 3의 배수이냐?
		IntPredicate x3 = x.and(x2);
		boolean result = x3.test(6);
		System.out.println(result);
		
		//2. 전달된 값이 2의 배수이거나 3의 배수인가?
		
		IntPredicate x4 = x.or(x2);
		boolean result2 = x4.test(16);
		System.out.println(result2);
		
		//3. 전달된 값이 2의 배수가 아닌가
		IntPredicate x5 = x.negate();
		boolean result3 = x5.test(16);
		System.out.println(result3);
	}

}
