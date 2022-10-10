package part_7;

public class Ex7_10 {
    public static void main(String[] args) {

    }
}

abstract class Unit{
    int x,y;
    abstract void move(int x, int y);
    void stop(){}
}

class Margine extends Unit{

    @Override
    void move(int x, int y) {

    }
}
