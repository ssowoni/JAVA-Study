package kh.generics;

interface Mufunction<T>{
	void print(T x);
}

public class Ex1 {

	public static void main(String[] args) {

		Mufunction<String> f1 = x -> System.out.println(x);
		f1.print("hello");
		
		
		Mufunction<Integer> f2 = x->System.out.println(x);
		f2.print(Integer.valueOf(100));
		
	}

}
