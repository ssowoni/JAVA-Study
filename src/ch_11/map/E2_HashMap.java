package ch_11.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class E2_HashMap {

	public static void main(String[] args) {
		int total = 0;
		HashMap map = new HashMap();
		map.put("안자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		

		
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()) {
			//map에서 entry로 
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름 : " + e.getKey() + " 점수 : " + e.getValue());
		}
		
		Set set = map.keySet();
		System.out.println("참가자 명단 : " + set);
		
		
		Collection values = map.values();
		it = values.iterator();
		
		while(it.hasNext()) {
			int i = (int)it.next();
			total +=i;
		}
		
		System.out.println("총점" + total);
		System.out.println("총점" + (float)total/set.size());
		System.out.println("총점" + total);
		System.out.println("총점" + total);
		
	}

}
