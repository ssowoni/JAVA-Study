package ch14.rambda;

import java.util.function.Function;
import java.util.function.Supplier;

public class Ex3_methodReference {

	public static void main(String[] args) {

		//Function<String,Integer> f= (String s) -> Integer.parseInt(s);
		Function<String,Integer> f= (String s) -> Integer.parseInt(s);
		Function<String,Integer> f1 = Integer::parseInt;
		System.out.println(f.apply("100")+200);
		System.out.println(f1.apply("100")+200);
		
	
		//supplier는 입력x , 출력o
		Supplier<MyClass> s = ()->new MyClass();
		Supplier<MyClass> s2 = MyClass :: new;
		System.out.println(s.get());
		System.out.println(s2.get());
		
		
		//function은 입력 o, 출력 o
		Function<Integer, MyClassG> fg = (i)->new MyClassG(i);
		System.out.println(fg.apply(100).iv);
		
		
		//Function으로 배열 생성
		Function<Integer, int[]> fa = (i)->new int[i];
		System.out.println("fa.length = "+fa.apply(100).length);
		
		
		
		
		
		
	}

}

class MyClass{
	
}

class MyClassG{
	int iv;
	
	MyClassG(int iv){
		this.iv = iv;
	}
}