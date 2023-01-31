package ch_11.set;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex10_HashSet3 {

	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(new Person("sowon", 28));
		set.add(new Person("sowon", 28));
		
		System.out.println(set.size());
		
		System.out.println(set);
		
	}

}


class Person{

	String name;
	int age;
	
	
	
	@Override
	public boolean equals(Object o) {
		
		if(o instanceof Person) {
			Person personO = (Person)o;
			return name.equals(personO.name) && age == personO.age;
		}
		
		return false;
		
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name,age);
	}
	
	
	
	
	
	Person(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString() {
		return name + ": " + age;
		
	}
	
	
}
