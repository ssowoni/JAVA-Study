package kh.abstract_interface;

interface RemoteControll{
	void turnOff();
	void turnOn();
}

public class Ex02 {

	
	public static void main(String[] args) {
		
		RemoteControll rt = new RemoteControll(){
			
			public void turnOff(){
				System.out.println("tv turnOff");
				}
			
			public void turnOn() {
				System.out.println("tv turnOn");
			}
			
		};
//		RemoteControll rt2 = new RemoteControll(); //추상 클래스의 객체를 만들려고 하면 에러.
		
		rt.turnOff();

	}

	
	

}
