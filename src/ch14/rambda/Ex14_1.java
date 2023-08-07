package ch14.rambda;

public class Ex14_1 {

	
	static void execute(MyFunction f) {
		f.run();
	}
	
	static MyFunction getMyFunction() {
		MyFunction f = ()->System.out.println("f3.run");
		return f;
	}
	
	
	public static void main(String[] args) {
		MyFunction f1 = ()->System.out.println("f1.run");
		
		MyFunction f2 = new MyFunction() {
			public void run() { //오버라이딩 - 접근 제어자는 좁게 못바꾼다. 따라서 public 붙여야함.
								//안 붙임 default가 되니까. 
				System.out.println("f2.run");
			}
		};
		
		MyFunction f3 = getMyFunction();
		
		f1.run();
		f2.run();
		f3.run();
		
		execute(f1);
		execute(()->System.out.println("run()"));

	}

}

@FunctionalInterface
interface MyFunction{
	public abstract void run();
}
