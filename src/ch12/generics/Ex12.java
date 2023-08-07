package ch12.generics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex12 {

	public static void main(String[] args) {
		
		List<Student> list = new ArrayList<Student>();
		list.add(new Student("일소원",2,3));
		list.add(new Student("이소원",4,8));
		list.add(new Student("삼소원",6,5));


		Iterator<Student> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next()); //iterator를 통해 가져온 값은 Object형
			/*
			 * Student st = it.next(); System.out.println(st.name);
			 */
		}
		
	}

}

class Student{
	String name ="";
	int ban;
	int no;
	
	Student(String name, int ban, int no){
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
	
	@Override
	public String toString() {
		return name + "은 " +ban +"반 " + no +"번 입니다.";
		
	}
}
