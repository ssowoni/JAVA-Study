package ch_11;

import java.util.Arrays;
import java.util.List;

public class Ex6_Arrays {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4};
		int[] arr2 = Arrays.copyOf(arr, 3);
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2));
		
		
		int[] arr3 = new int[5];
		Arrays.fill(arr3, 9);
		System.out.println(Arrays.toString(arr3));
		Arrays.setAll(arr3, (i)->(int)(Math.random()*5)+1);
		System.out.println(Arrays.toString(arr3));
		
		int[] arr4 = {5,3,2,1,4};
		System.out.println(Arrays.binarySearch(arr4, 1)); //잘못 된 결과 나옴.
		
		Arrays.sort(arr4);
		System.out.println(Arrays.toString(arr4));
		//binarySearch()는 배열에서 지정된 값이 저장된 위치(index)를 반환
		int idx = Arrays.binarySearch(arr4, 4);
		System.out.println(idx);
		
		List list = Arrays.asList(1,2,3,5,6);
		List list2 = Arrays.asList(new Integer[] {1,2,3,4,5});
		System.out.println(list);
	}
	

}
