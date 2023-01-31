package ch_11.set;

import java.util.TreeSet;

public class Ex11_TreeSet2 {

	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		int[] score = {80,90,50,95,45,35,65,10,100};
		
		for(int i : score) {
			set.add(i);
		}
	
	System.out.println("정렬전 : " + set);
	
	
	
	}
	
	

}
