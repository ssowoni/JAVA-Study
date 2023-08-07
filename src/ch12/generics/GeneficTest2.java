package ch12.generics;

import java.util.ArrayList;


class Tv{}
class Audio{}

public class GeneficTest2 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		//어느 타입이든 저장 가능 
		list.add(new Tv());
		list.add(new Audio());

		Tv t = (Tv) list.get(0);
	
		ArrayList<Tv> list2 = new ArrayList<Tv>();
		//Tv 타입만 저장 가능 
		list2.add(new Tv());
		//list2.add(new Audio());
		
		Tv t2 = list2.get(0);

	
	}

}
