package ch_11.list;

import java.util.Arrays;

public class Ex7_ArraysEx {

	public static void main(String[] args) {

		int[] arr = new int[5];
		Arrays.setAll(arr, (i)->(int)(Math.random()*5)+1);
		System.out.println(Arrays.toString(arr));

		/*
		 * for(int i=0; i<arr.length;i++) { for(int j=0;j<arr[i];j++){
		 * System.out.print('*'); } System.out.println(arr[i]); }
		 */
		
		for(int i : arr) {
			char[] graph = new char[i];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+i);
		}
		
		
		for(int i=0; i<arr.length;i++) {
			char[] graph = new char[arr[i]];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph)+arr[i]);
		}
		
		
	}
	

}
