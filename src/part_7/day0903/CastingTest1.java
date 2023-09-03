package part_7.day0903;

import java.util.ArrayList;
import java.util.List;

/**
 * 참조변수가 사용할 수 있는 멤버의 개수는 인스턴스의 개수보다 같거나 적어야 한다.
 * 즉) 자손타입의 참조변수로 조상타입의 인스턴스를 참조하는 것은 불가능하다.
 * 예를들어 Tv를 상속받고 있는 CationTv 클래스가 있을 때,
 * CaptionTv c = new Tv();와같은 코드는 선언 불가능하다.
 *
 * ★ 조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다.
 * 반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수는 없다.
 *
 * 형변환은 참조변수의 타입을 변환하는 것이지 인스턴스를 변환하는 것은 아니기 때문에
 * 참조변수의 형변환은 인스턴스에 아무런 영향을 미치지 않는다.
 * 단지 참조변수의 형변환을 통해서, 참조하고 있는 인스턴스에서 사용할 수 있는 멤버의 범위를 조절하는 것뿐이다.
 *
 * Tv
 *
 */
public class CastingTest1 {
    public static void main(String[] args) {


        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//        car.water();  -> 사용 불가. 왜냠 참조변수가 Car이기 때문에
        fe2 = (FireEngine) car;
        fe2.water();

    }
}

class Car {
    String color;
    int door;

    void drive() { 		// 운전하는 기능
        System.out.println("drive, Brrrr~");
    }

    void stop() {		// 멈추는 기능
        System.out.println("stop!!!");
    }
}

class FireEngine extends Car {	// 소방차
    void water() {		// 물을 뿌리는 기능
        System.out.println("water!!!");
    }
}