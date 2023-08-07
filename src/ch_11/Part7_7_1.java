package ch_11;

public class Part7_7_1 {

	public static void main(String[] args) {
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; // car = (Car)fe;에서 형변환이 생략됨
		car.drive();// car에 값을 대입하기 전에 실행시킴 에러!
		
	//	car.water();//컴파일 에러! Car 타입의 참조변수로 water() 호출 불가
		fe2 = (FireEngine)car; //자손타입 <- 조상타입. 형변환 생략 불가
		fe2.water();
		fe2.drive();
	
	}

}

class Car{
	String color;
	int door;
	
	void drive() { //운전하는 기능
		System.out.println("drive, Brr~");
	}
	void stop() { //멈추는 기능
		System.out.println("stop!!");
	}
}

class FireEngine extends Car{
	void water() {//물 리는 기능
		System.out.println("water!!");
	}
}


