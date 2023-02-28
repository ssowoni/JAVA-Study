package ch14.stream;

import java.util.Comparator;
import java.util.stream.Stream;

public class Ex4_comparator {

	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("김",3,300),
				new Student("이",1,200),
				new Student("박",2,100),
				new Student("신",2,150),
				new Student("정",1,200),
				new Student("장",3,290),
				new Student("한",3,180)
				);
		
		studentStream.sorted(Comparator.comparing(Student::getBan)
		.thenComparing(Comparator.naturalOrder()))
		.forEach(System.out::println);
		
	}

}



class Student implements Comparable<Student>{
	
	String name;
	int ban;
	int totalScore;
	
	
	
	
	public Student(String name, int ban, int totalScore) {
		super();
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	
	public String toString() {
		return String.format("[%s,%d,%d]", name,ban,totalScore);
				
	}
	
	
	String getName() {return this.name;}
	int getBan(){return this.ban;}
	int totalScore() {return this.totalScore;}
	
	//총점을 내림차순으로 기본 정렬
	public int compareTo(Student s) {
		return s.totalScore - this.totalScore;
	}



}
