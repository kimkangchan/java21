package exam20_컬렉션API;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// Map 계열 : key / value 쌍으로 저장.
		Map<String, String> map = new HashMap<String, String>(); // 다형성

		// 데이터 저장 방법
		map.put("p1", "홍길동");
		map.put("p2", "이순신");
		map.put("p3", "유관순");
		map.put("p3", "유관순2"); // 동일한 key로 수정

		// 데이터 출력 1- get(key)
		System.out.println(map.get("p1"));
		System.out.println(map.get("p2"));
		System.out.println(map.get("p4")); // null, 존재하지 않는 key 값은 null 리턴
		System.out.println("=========================");

		// 데이터 출력 2- toString()
		System.out.println(map);
		System.out.println(map.toString());
		System.out.println("=========================");

		// 데이터 출력 3 - keySet() 이용해서 key만 추출하고 나중에 value 추출
		Set<String> keys = map.keySet();
		System.out.println(keys);

		for (String key : keys) {
			System.out.println(map.get(key));
		}
		System.out.println("=========================");

		// 데이터 출력4 - value 값만 얻기
		Collection<String> data = map.values();
		for (String v : data) {
			System.out.println(v);
		}

		// 추가메서드
		System.out.println("key 존재여부 : " + map.containsKey("p1"));
		System.out.println("value 존재여부 : " + map.containsValue("홍길동"));
		System.out.println("값 크기 : " + map.size());

		// 삭제
		String del = map.remove("p1");
		System.out.println("삭제된 데이터 : " + del);
		System.out.println(map);

		// 전체삭제
		map.clear();
		System.out.println(map);

		// 생성 방법2
		Map<String, Integer> map2 = Map.of("k1", 10, "k2", 20);// 수정불가
		// map2.put("k3", 30); 오류!! 수정불가
		System.out.println(map2);
		

	}

}
