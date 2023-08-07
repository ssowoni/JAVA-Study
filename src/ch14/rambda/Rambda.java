package ch14.rambda;

public class Rambda {

	public static void main(String[] args) {

		 
		
		MyFunction1 f = (a,b) -> a>b ?a:b;
		int big = f.max(3, 5);
		System.out.println(big);
		
		
		
	}
		
	
	

}

interface MyFunction1{
	public abstract int max(int a, int b);
}
