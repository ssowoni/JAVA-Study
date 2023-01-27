package ch_11;

import java.util.Scanner;
import java.util.Stack;

public class Ex3_Stack {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		Stack st = new Stack();
		
		try {
		for(int i=0; i<text.length(); i++) {
			char ch = text.charAt(i);
			
				if(ch == '(') {
					st.push(ch);
				}else if(ch ==')') {
					st.pop();
				}
			}
				if(st.isEmpty()) {
					System.out.println("괄호가 일치합니다.");
				}else {
					System.out.println("괄호가 일치하지 않습니다.");
				}
			}catch(Exception e){
				System.out.println("괄호가 일치하지 않습니다.");
			}
			
		
		
	}

}
