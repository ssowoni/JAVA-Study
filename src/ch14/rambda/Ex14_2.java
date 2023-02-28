package ch14.rambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ex14_2 {

	public static void main(String[] args) {
		
		//매개변수 x, 반환값 o , 값을 공급해준다. 
		Supplier<Integer> s = ()->(int)(Math.random()*100)+1;
		//매개변수 o, 반환값 x , 값을 받아가서 소비해버린다. 
		Consumer<Integer> c= i->System.out.print(i+", ");
		//매개변수 o, boolean형으로 반환함
		Predicate<Integer> p = i -> i%2==0;
		//매개변수 o, 반환값 o
		Function<Integer, Integer> f = i -> i/10*10;
		
		List<Integer> list = new ArrayList<>();
		
		makeRandomList(s,list);
		System.out.println(list);
		
		printEvenNum(p,c,list);
		
		List<Integer> newList = doSomething(f,list);
		System.out.println(newList);
		
	}
	
	
	static <T> List<T> doSomething(Function<T,T> f, List<T> list){
		List<T> newList = new ArrayList<T>(list.size()); //초기 용량(capacity)지정
		
		// 0 ~ list 크기 만큼 반복 
		for(T i : list) {
			//f.apply(0)의 값을 newList에 추가 
			newList.add(f.apply(i));
		}
		return newList;
	}
	
	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
		System.out.print("[");
		for(T i : list) {
			if(p.test(i))
				c.accept(i);
		}
		System.out.println("]");
	}
	
	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
		for(int i=0; i<10;i++) {
			list.add(s.get());
		}
	}
	 

}
