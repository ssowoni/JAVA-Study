package part_14;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Ex14_1 {


    static void execute(MyFunction f){ //매개변수 타입이 MyFunction 메서드
        f.run();
    }

    static MyFunction getMyFunction(){ //반환 타입이 MyFunction인 메서드
       /*
       MyFunction f = () -> System.out.println("f3.run()");
        return f;*/

        return  () -> System.out.println("f3.run()");
    }


    public static void main(String[] args) {

        String[] strArr = {"aaa", "bbb", "ccc"};
        List<String> strList = Arrays.asList("strArr");

        Stream<String> strStream1 = strList.stream();
        Stream<String> strStream2 = Arrays.stream(strArr);

        strStream1.sorted().forEach(System.out::println);
        strStream2.sorted().forEach(System.out::println);

        //람다로 MyFunction의 run() 구현
        MyFunction f1 = () -> System.out.println("f1.run()");

        MyFunction f2 = new MyFunction() { //익명 클래스로 run() 구현
            @Override
            public void run() {
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