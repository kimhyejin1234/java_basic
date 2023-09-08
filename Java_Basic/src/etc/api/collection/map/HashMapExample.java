package etc.api.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		/*
        # Map
        - Key / Value가 한 세트를 이루는 자료구조
        - Key값을 통해 Value를 참조하는 방식.
        - Key는 중복 저장을 허용하지 않는다.
        */
		
		//Map 은 Key,Value 쌍을 이루기 때문에 멀티 제네릭을 설정
		Map<String,String> map = new HashMap<>();
		
		//Map 에 데이터를 추가하는 메서드:put(key,value)
		map.put("멍멍이","김철수");
		map.put("야옹이","홍길동");
		map.put("짹짹이","박영희");
		System.out.println(map);
		
		//Map 은 Key 의 중복을 허용하지 않습니다.
		//만약 중복 Key 을 사용하요 put 을 호출하면 Value 만 수정됩니다.
		map.put("멍멍이","김뽀삐");//key 중복
		map.put("어흥이","홍길동");//value 중복
		System.out.println(map);
		
		//Map 내부의 값을 참조하는 법:get(key)
		System.out.println(map.get("야옹이"));
		System.out.println(map.get("메뚜기"));
		
		//Map 내부의 key 의 존재 유무를 확인하는 메서드:containsKey(key)
		String name = "야옹이";
		if(map.containsKey(name)) {
			System.out.printf("%s 의 별명을 가진 학생은 %s 입니다..\n",name,map.get(name));
		}else {
			System.out.println("그런 별명을 가진 학생은 없습니다.");
		}
		
		//Map 의 크기 확인하는 메서드 : size()
		System.out.println("map 의 크기 : " + map.size());
			
		//Map 에서 key 들만 추출하는 메서드 : keyset()
		//모든 key 들을 Set 에 담아서 반환합니다.
		Set<String> keys = map.keySet();
		for(String k : keys) {
			System.out.println(k + " : " + map.get(k));
		}
		
		//Map 의 객체를 삭제 : remove(key)
		//key 를 주면 value 도 함께 삭제됩니다.
		map.remove("야옹이");
		System.out.println(map);
		
		map.clear();
		System.out.println(map);
		
	}

}
