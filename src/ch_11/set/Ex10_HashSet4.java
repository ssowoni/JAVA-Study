package ch_11.set;

import java.util.HashSet;
import java.util.Set;

public class Ex10_HashSet4 {

	public static void main(String[] args) {
	
		
		Set A = new HashSet();
		Set B = new HashSet();
		
		A.add(1); A.add(2); A.add(3); A.add(4); A.add(5);
		B.add(4); B.add(5); B.add(6); B.add(7); B.add(8);
		
		System.out.println(A);
		System.out.println(B);
	
		Set hap = new HashSet();
		Set kho = new HashSet();
		Set cha = new HashSet();
		
		hap.addAll(A);
		hap.addAll(B);
		System.out.println(hap);
		
		kho.addAll(B);
		kho.retainAll(A);
		System.out.println(kho);
		
		
		cha.addAll(A);
		cha.removeAll(kho);
		System.out.println(cha);
	}
	
	

}
