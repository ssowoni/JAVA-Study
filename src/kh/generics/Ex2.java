package kh.generics;


class SimplePair<T>{
	private T first;
	private T second;
	
	
	public SimplePair(T first, T second) {
		this.first = first;
		this.second = second;
	}
	
	public T getFirst() {
		return first;
	}
	public void setFirst(T first) {
		this.first = first;
	}
	public T getSecond() {
		return second;
	}
	public void setSecond(T second) {
		this.second = second;
	}
	
	
}


public class Ex2 {

	public static void main(String[] args) {

	SimplePair<String> pair = new SimplePair<String>("apple", "tomato");
	
	System.out.println(pair.getFirst());
	System.out.println(pair.getSecond());
	
	}

}
