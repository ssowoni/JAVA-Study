package part_11;

import java.util.ArrayList;
import java.util.Collections;


public class Ex11_1_ArrayList {
    public static void main(String[] args) {
        //ArrayList 는 저장순서가 유지되고 중복을 허용한다.
        //ArrayList는 Object 배열을 이용해 데이터를 순차적으로 저장한다.
        //배열에 더 이상 저장할 공간이 없으면 보다 큰 배열을 생성해 저장된 내용을 새로운 배열로 복사한 다음 저장한다.

        ArrayList list = new ArrayList(10);
        list.add(new Integer(5));
        list.add(new Integer(4));
        list.add(new Integer(2));
        list.add(new Integer(0));
        list.add(new Integer(1));
        list.add(new Integer(3));

        //list.subList(start, end) start 숫자부터 end-1까지
        ArrayList list2 = new ArrayList(list.subList(1, 4));
        print(list, list2);

        //Collection은 인터페이스, Collections는 클래스이다.
        Collections.sort(list);
        Collections.sort(list2);
        print(list, list2);

        System.out.println("list.containsAll(list2) : " + list.containsAll(list2));

        list2.add("B");
        list2.add("C");
        list2.add(3,"A");
        print(list, list2);

        //list에서 list2와 겹치는 부분을 제외한 나머지는 삭제한다.
        System.out.println("list.retainAll(list2) : " +list.retainAll(list2));
        print(list, list2);

        for(int i=list2.size()-1; i>=0; i--){
            if(list.contains(list2.get(i)))
            list2.remove(i);
        }
        print(list, list2);



    }

    static void print(ArrayList list, ArrayList list2){
        System.out.println("list = " + list);
        System.out.println("list2 = " + list2);
        System.out.println();
    }
}
