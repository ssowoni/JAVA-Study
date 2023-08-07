package ch_11.list;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex2_StackQueue {

	public static void main(String[] args) {


		Stack st = new Stack();
		st.push(0);
		st.push(1);
		st.push(2);

		/*
		 * while(true) { if(st.empty() == false) { System.out.println(st.pop()); }else{
		 * break; } }
		 */
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
		
		Queue qu = new LinkedList();
		qu.add(0);
		qu.add(1);
		qu.add(2);
		
		
		while(!qu.isEmpty()) {
			System.out.println(qu.poll());
		}
		
		
		
		
		
		
		
	}

}

/*
 * stack 메서드 
 * peek() : stack의 맨 위에 저장된 객체를 반환. (비워내지는 않음)
 * pop() : stack의 맨 위에 저장된 객체를 꺼냄. (즉 꺼내서 비워냄) 
 * push(Object o) : stack 객체 저장
 * search(Object o ) : stack에서 주어진 객체를 찾아 위치반환
 * 
 * Queue  메서드
 * add(Object o) : 지정된 객체를 Queue에 추가. 성공하면 true 반환
 * remove() : Queue에서 객체 꺼내 반환
 * element() : 삭제 없이 요소를 읽어온다. 
 * */
