package kh.rambda;

import java.util.Arrays;
import java.util.Comparator;

public class Ex01 {

	public static void main(String[] args) {
		
		String[] arr = {"로마에 가면 로마법을 따르자", "시간은 금임다" , "펜은 칼보다 강하다"};
		
		//1. 일반 배열 sort 
		
		
		Arrays.sort(arr,new charLength());
		System.out.println(Arrays.toString(arr));
		
		
		//2. 람다식 sort 
		
		Arrays.sort(arr, (first, second)->first.length()- second.length());
		System.out.println(Arrays.toString(arr));
	}

}

class charLength implements Comparator<String>{

	@Override
	public int compare(String s1 , String s2) {
		return s1.length() - s2.length();
	
	}
	
}