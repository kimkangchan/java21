package exam22_StreamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.ToDoubleFunction;

public class StreamTest5_Optional {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		// 데이터가 존재할 때
//		list.add(30);
//		list.add(30);

		// int -> double
		ToDoubleFunction<Integer> f = new ToDoubleFunction<Integer>() {

			@Override
			public double applyAsDouble(Integer n) {
				// TODO Auto-generated method stub
				return n;
			}
		};
		ToDoubleFunction<Integer> f2 = n -> n;
		// 최종코드 아님
		OptionalDouble x = list.stream().mapToDouble(n -> n).average();
		System.out.println(x);
//		System.out.println(x.getAsDouble()); // double 변환
//		System.out.println(x.orElse(0.0));

		// 최종코드
		double avg = list.stream().mapToDouble(n -> n).average().orElse(0.0);
		System.out.println(avg);

	}
}