package ch12.generics;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		
		//1. 지네릭스 사용 x
		
		ArrayList list = new ArrayList();
		list.add(10);
		list.add(20);
		list.add("30"); //String을 추가, 컴파일 에러 발생 x
		
		/*컴파일 ok, why?? list는 object형인데 이를 Integer로 형변환 했으므로
		 * 컴파일러가 봤을때는 문제가 없다. 그러나 실행 시키면 ClassCastException 발생 -> 컴파일 한계*/
		Integer i = (Integer) list.get(2); 
		
		System.out.println(list);
		
		
		
		//2. 지네릭스 사용
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10); //list.add(new Integer(10));
		list2.add(20);
		list2.add(30); //String을 추가할 경우, 컴파일러가 에러를 발생시킴.
		
		Integer i2 = list2.get(2); //Integer 밖에 못들어가는 걸 아니까 형변환할 필요가 없다. 
		
		System.out.println(list2);
		
		
	}
}
