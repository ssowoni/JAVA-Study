package ch_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
	}
}


/*
 * Iterator : 컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스 
 * ListIterator : iterator 양방향 조회 기능 추가(List를 구현한 경우에만 사용 가능)
 * 
 * 
 * 
 * 
 * 
 * 
 * */
 