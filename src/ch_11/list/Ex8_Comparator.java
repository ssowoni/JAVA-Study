package ch_11.list;

import java.util.Arrays;
import java.util.Comparator;

public class Ex8_Comparator {

	public static void main(String[] args) {
		
		String [] strArr = {"cat", "Dog", "lion", "tiger"};
		
		Arrays.sort(strArr); //대문자 먼저 정렬 후 소문자 정렬
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //대소문자 구문 안함
		System.out.println(Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		System.out.println(Arrays.toString(strArr));
		
	}

}


class Descending implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
		}
		return -1; //비교할 수 없는 대상이면 -1 반환
	}
	
}