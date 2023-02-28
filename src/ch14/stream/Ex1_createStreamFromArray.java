package ch14.stream;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex1_createStreamFromArray {

	public static void main(String[] args) {

		/*
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		Stream<Integer> intStream = list.stream(); //리스트를 스트림으로 바꿀 수 있다. 
		
		
		 Iterator it = intStream.iterator(); while(it.hasNext()) {
		 System.out.println(it.next()); }
		 
		 System.out.println();
		 */
		
		/* intStream.forEach(System.out::print); */	
		
		
		// ★ 1. 스트림 만들기 - 배열 
		
	
		String [] strArr = new String[] {"a","b","c","d"};
		//	String [] strArr = {"a","b","c","d"}; 위의 코드를 줄이면 이렇게 된다. 
		//Stream<String> strStream = Stream.of(strArr);
		Stream<String> strStream = Arrays.stream(strArr);
		strStream.forEach(System.out::print);
		
		System.out.println();
		
		int[] intArr = {1,2,3,4,5};
		IntStream intStream = Arrays.stream(intArr);
		intStream.forEach(System.out::print);
		
		/*
		 * Integer[] intArr = {1,2,3,4,5}; Stream<Intger> intStream =
		 * Arrays.stream(intArr);
		 */
	
	}

}
