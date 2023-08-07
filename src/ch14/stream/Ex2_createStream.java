package ch14.stream;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex2_createStream {

	public static void main(String[] args) {

		// ★ 2. 스트림 만들기 - 임의의 수 
		IntStream intStream = new Random().ints(1,10); //무한 난수 스트림
		intStream.limit(5).forEach(System.out::println);
		 
		
		// ★ 3. 스트림 만들기 - 람다식
		Stream<Integer> intStream2 = Stream.iterate(1, n->n+2);
		intStream2.limit(10).forEach(System.out::println);
		
	}

}
