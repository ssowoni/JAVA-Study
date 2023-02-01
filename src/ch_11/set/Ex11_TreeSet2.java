package ch_11.set;

import java.util.TreeSet;

public class Ex11_TreeSet2 {

	public static void main(String[] args) {

		TreeSet<Integer> set = new TreeSet<Integer>();
		int[] score = {80,90,50,95,45,35,65,10,100};
		
		for(int i : score) {
			set.add(i);
		}
	
	System.out.println("정렬전 : " + set);
	
	System.out.println("50보다 큰 값 : " + set.tailSet((50)));
	System.out.println("50보다 작은 값 : " + set.headSet(50));
	
	
	}
	
	

}
