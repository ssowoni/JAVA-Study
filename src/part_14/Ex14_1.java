package part_14;

public class Ex14_1 {

    static void execute(MyFunction f){ //매개변수 타입이 MyFunction인 메서드
        f.run();
    }

    static MyFunction getMyFunction(){ //반환 타입이 MyFunction인 메서드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {
        //psvm 입력 후 엔터 치면 자동 완성
        //람다식으로 MyFunction의 run() 구현
        //f1과 f2가 같은 의미
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction(){ //익명 클래스로 run() 구현
            public void run(){ //public 을 반드시 붙여야 한다.
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);
        execute(()-> System.out.println("run()"));

    }
}


@FunctionalInterface
interface MyFunction{
    void run(); //public abstract void run();
}
