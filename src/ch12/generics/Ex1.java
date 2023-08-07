package ch12.generics;

import java.util.ArrayList;

class Product{}
class Tv1 extends Product{}
class Audio1 extends Product{}


public class Ex1 {

	public static void main(String[] args) {
		
		ArrayList<Product> productList = new ArrayList<Product>();
		ArrayList<Tv1> tvList = new ArrayList<Tv1>(); // 에러
//		ArrayList<Product> tvList = new ArrayList<Tv>(); // 에러
//		List<Tv> tvList = new ArrayList<Tv>(); //ok . 다형성
		
		productList.add(new Tv1()); // product와 그 자손들은 모두 추가 가능하다. 
		productList.add(new Audio1());

		tvList.add(new Tv1()); // product와 그 자손들은 모두 추가 가능하다. 
//		tvList.add(new Audio1()); Audio1는 Tv1의 자손이 아니기 때문에 대입 불가. 

		printAll(productList);
		
	}
	
	public static void printAll(ArrayList<Product> list) {
		for(Product p : list) {
			System.out.println(p);
		}
	}

}
