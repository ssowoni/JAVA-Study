package ch_11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex10_HashSet1 {

	public static void main(String[] args) {
		Object[] objArr = {"1", new Integer(1), "2","2","3","3","3"};
		Set set = new HashSet();
		for(int i=0; i<objArr.length; i++) {
			set.add(objArr[i]);
		}
		//여기서 살펴보면 set은 중복된 값은 저장하지 않는다는 걸 알 수 있다. 
		System.out.println(set);
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
