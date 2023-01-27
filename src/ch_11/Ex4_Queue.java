package ch_11;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex4_Queue {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		final int MAX_SIZE = 5;
		Queue q = new LinkedList();
		
		
		
		while(true) {
		System.out.print("명령어를 입력하세요 : ");
		String text = sc.next();
		q.add(text);
		if(q.size()>MAX_SIZE) q.remove();
		//equalsIgnoreCase() 대소문자 구분없이 비교
		if(text.equalsIgnoreCase("q")) {
			break;
		}else if(text.equals("help")) {
			System.out.println("도움말");
		}else if(text.equals("history")) {
			/*
			 * for(int i=1; i<MAX_SIZE+1; i++) { System.out.println(i + ". " + q.remove());
			 * }
			 */                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              
			
			// 자손타입 <- 조상타입. 형변환 생략 불가
			LinkedList list = (LinkedList) q;
			Iterator it = q.iterator();
			int i =0;
			while(it.hasNext()) {
				System.out.println(++i + ". " + it.next());
			}
		}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
		}
	}
}
