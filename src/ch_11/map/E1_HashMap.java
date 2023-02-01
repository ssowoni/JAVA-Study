package ch_11.map;

import java.util.HashMap;
import java.util.Scanner;

public class E1_HashMap {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("abcd", 1234);
		map.put("eeee", 12345);
		
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id와 password를 입력해주세요");
		System.out.print("id : ");
		String id =  sc.next();
		System.out.print("password : " );
		String pass = sc.next();
		
		if(!map.containsKey(id)) {
			System.out.println("해당 id는 존재하지 않습니다.");
		}else if( !(map.get(id) instanceof Integer )) {
			System.out.println("비밀번호는 숫자로 입력해 주세요");
		}
		else if(map.get(id).equals(pass)) {
			System.out.println("비밀번호가 일치합니다.");
			break;
		}else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		}
		
		
		
	}

}
