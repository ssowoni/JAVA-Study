package part_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex11_5_Iterator {
    //Iterator : 컬렉션에 저장된 요소를 접근하는데 사용되는 인터페이스 (표준화)
    //ListIterator : Iterator에 양방향 조회기능추가(List를 구현한 경우만 사용 가능)
    //iterator는 Collection 인터페이스에 정의된 메서드로, List & Set 포함!

    //다만 Map은 key와 value의 쌍을 저장하기 때문에 iterator()를 호출할 수 없다.
    //대신 keySet()이나 entrySet()과 같은 메서드를 통해 키와 값을 따로 Set 형태로 얻와야함.

    //이처럼 공통 인터페이스를 정의해 표준을 정의하고 구현하여 표준을 따르도록 함으로써
    //코드의 일관성을 유지하고, 재사용성을 극대화하는 것이 객체지향 프로그래밍의 중요한 목적!

    public static void main(String[] args) {
        /* 표준
        List list = new ArrayList(); //다른 컬렉션으로 변경할 때 이부분만 고치면 된다.

        Iterator it = list.iterator();
        while (it.hasNext()){ //boolean hasNext() 읽어올 요소가 있는지 확인한다
            System.out.println(it.next()); // Object next() 다음 요소를 읽어옴
         */

            ArrayList list = new ArrayList();
            list.add("1");
            list.add("2");
            list.add("3");
            list.add("4");
            list.add("5");

            System.out.println("iterator 이용해서 list값 출력");
            Iterator it = list.iterator();
            while (it.hasNext()){
                Object obj = it.next();
                System.out.println(obj);
            }

            System.out.println("get 이용해서 list값 출력");
            for(int i=0; i<list.size();i++){
                Object obj2 = list.get(i);
                System.out.println( obj2);
            }

        }
    }

