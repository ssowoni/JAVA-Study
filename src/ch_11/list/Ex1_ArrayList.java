package ch_11.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Ex1_ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		boolean add(Object o); // ArrayList 마지막에 객체 추가 
		Object get(int index); //저장된 위치의 객체 반환
		int indexOf(Object o);//지정된 객체가 저장된 위치를 찾아 반환
		Object remove(int index); //지정된 위치에 있는 객체를 제거
		boolean retainlAll(Collection c); 
		// ArrayList에 저장된 객체 중 주어진 컬렉션과 공통된 것만 남기고 나머지 삭제
		Object set(int index, Object element); //주어진 객체를 지정된 위치에 저장
		void sort(Comparator c); // 지정된 정렬 기준(c)으로 ArrayList 정렬
		List subList(int fromIndex, int toIndex);//
		*/
		
		
		List list1 = new ArrayList();
		List list2 = new ArrayList();
		list1.add(5);
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		list2.add(4);
		list2.add(2);
		list2.add(0);
		
		
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		
		
		Collections.sort(list1);
		Collections.sort(list2);
		System.out.println("list1 : " + list1 );
		
		System.out.println(list1.containsAll(list2));
		
		System.out.println("list1 : " + list1 );
		System.out.println("list2 : " + list2 );
		
		list2.add("A");
		list2.add("B");
		list2.add("C");
		
		System.out.println("list2 : " + list2 );
		
		list2.set(3, "AA");
		
		System.out.println("list2 : " + list2 );
		
		list1.retainAll(list2);
		
		System.out.println("list1 : " + list1 );
		
		
		//list2의 값이 list1 이랑 동일하면 삭제해라.   
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		
		System.out.println("list1 : " + list1 );
		System.out.println("list2 : " + list2 );
		
		
		
		
	}
                  
}
