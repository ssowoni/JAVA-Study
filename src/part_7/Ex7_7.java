package part_7;

public class Ex7_7 {
    public static void main(String[] args) {

    Car c = new Car();
        c.color = "blue";
        System.out.println("car의 색은? " + c.color);

    Fire f = new Fire();
        f.color = "red";
        System.out.println("Fire 색은? " + f.color);

    Car car = null;
     car = f;
     car.color = "pink";
        System.out.println("car의 색은? " + car.color);






    }
}


class Car{

    String color;
    int door;

    void run(){
        System.out.println("run~~~~");
    }

}

class Fire extends Car{


    void water(){
        System.out.println("water~~~");
    }

}
