package ch_11;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Ex5_Iterator {

	public static void main(String[] args) {
		
		//List를 구현한 다른 컬렉션 클래스에 대해서도 이와 동일한 코드 생성 가능.
		//ArrayList 대신 LinkedList 이와 같이 고치면 됨.
		List list = new ArrayList(); 
		list.add(1);
		list.add(2);
		Iterator it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		Map map = new HashMap();
		map.put("1번", 1);
		map.put("2번", 2);
		Set eSet = map.entrySet();
		Iterator it2 = eSet.iterator();
		
		//위의 두 문장을 메서드 체이닝으로 축약해보면
		Iterator it3 = map.entrySet().iterator();
		
		
		while(it2.hasNext()) {
			System.out.println(it2.next());
		}
		
		
	}
}


/*
 * Iterator : 컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스 
 * ListIterator : iterator 양방향 조회 기능 추가(List를 구현한 경우에만 사용 가능)
 * 
 * Map은 키(key)와 값을 쌍으로 저장하고 있기 떄문에 iterator()로 호출할 수 없다. 
 * 그 대신 keySet이나 entrySet과 같은 메서드를 통해 키와 값을 각각 따로 Set 형태로 얻어와야한다. 
 * 
 * 
 * */
 