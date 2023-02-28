package ch14.stream;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Ex5_map {

	public static void main(String[] args) {
		
	     File[] fileArr={new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak")
	                ,new File("Ex2.java"),new File("Ex1.txt")};
	     
	     
	     
	     Stream<File> fStream = Arrays.stream(fileArr);
	     
	     
	     Stream<String> fileNameStream = fStream.map((f) ->f.getName());
	     fileNameStream.forEach(System.out::println);
	     
	     fStream = Stream.of(fileArr);
	     
	     fStream.map(File::getName)
	     	.filter(s->s.indexOf('.') !=-1)
	     	.map(s-> s.substring(s.indexOf('.')+1))
	     	.map(String::toUpperCase)
	     	.distinct()
	     	.forEach(System.out::print);
	     
	     
	     
	}

}
