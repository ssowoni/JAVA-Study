package kh.collection;

import java.util.ArrayList;

public class Ex1 {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
	
		
		for(String str : list) {
			System.out.println(str);
		}
		
	}

}
