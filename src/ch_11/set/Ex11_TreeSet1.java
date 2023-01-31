package ch_11.set;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Ex11_TreeSet1 {

	public static void main(String[] args) {
	
		Set hashSet = new HashSet();
		for(int i=0; i<6; i++) {
			int random = (int)(Math.random()*45)+1;
			hashSet.add(random);
		}
		
		List list = new LinkedList(hashSet);
		Collections.sort(list);
		System.out.println(list);
		
		
		//treeSet은 정렬되어 저장되기 때문에 따로 정렬할 필요 없음. 
		Set treeSet = new TreeSet();
		for(int i=0; i<6; i++) {
			int random = (int)(Math.random()*45)+1;
			treeSet.add(random);
		}
		System.out.println(treeSet);
		
		
	
	}

}
