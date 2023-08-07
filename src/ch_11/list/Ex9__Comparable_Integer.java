package ch_11.list;

import java.util.Arrays;
import java.util.Comparator;

public class Ex9__Comparable_Integer {

	public static void main(String[] args) {
		Integer[] arr = { 20,30,50,10,40};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new DescComp());
		System.out.println(Arrays.toString(arr));
		
	}

}

class DescComp implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof  Integer))
		return -1;
		
		Integer i = (Integer)o1;
		Integer i2 = (Integer)o2;
		return i.compareTo(i2) * -1;
	}
	
}
