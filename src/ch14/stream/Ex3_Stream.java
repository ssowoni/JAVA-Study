package ch14.stream;

import java.util.stream.IntStream;

public class Ex3_Stream {

	public static void main(String[] args) {

		IntStream intStream = IntStream.rangeClosed(1, 10);
		intStream.filter(i->!(i%2==0)).forEach(System.out::println);
		
	}

}
