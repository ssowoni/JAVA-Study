package kh.abstract_interface;

public class Ex01 extends Ex01_Calculator{

	public static void main(String[] args) {
		
		Ex01_Calculator c= new Ex01();
			System.out.println(c.add(2, 3));
			System.out.println(c.substract(2, 3));
			System.out.println(c.average(new int[] {2,3,4}));
	}

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substract(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public double average(int[] a) {

		int sum= 0;
		double avg = 0;
		
		
		for(int arr : a) {
			sum += arr;
		}
		
		avg = sum/a.length;
		
		
		return avg;
	}

}
