package exam21_함수적인터페이스;

import java.util.function.BinaryOperator;
import java.util.function.IntUnaryOperator;

/*
@FunctionalInterface
public interface BinaryOperator<T>{
  T apply(T t, T t2);   // public abstract R apply(T t); 동일
} 

*/

public class OperatorTest {

	public static void main(String[] args) {
		BinaryOperator<String> x = new BinaryOperator<String>() {

			@Override
			public String apply(String t, String u) {

				return t + u;
			}
		};
		String s = x.apply("Hello", "world");
		System.out.println(s);

		BinaryOperator<String> x2 = (t, u) -> t + u;

		String s2 = x2.apply("Hello", "World!");
		System.out.println(s2);

		IntUnaryOperator x3 = new IntUnaryOperator() {

			@Override
			public int applyAsInt(int x) {

				return x + 100;
			}
		};
		int n = x3.applyAsInt(100);
		System.out.println(n);

		IntUnaryOperator x4 = y -> y + 100;

		int n2 = x4.applyAsInt(100);

		System.out.println(n2);

	}

}
