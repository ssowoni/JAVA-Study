package part_11;

//HashSet은 Set 인터페이스를 구현한 대표적인 컬렉션이며, Set의 특징대로 중복된 요소를 저장하지 않는다.
//HashSet에 새로운 요소 추가할때는 add나 addAll을 사용하는데 만약 중복된 요소 추가하려고 하면 false 반환

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_8_HashSet {

    public static void main(String[] args) {


        Object[] objArr = {"1", new Integer(1), "2", "2", "3", "3", "4", "4", "4"};
        Set set = new HashSet();

        //중복된 값은 저장하지 않는 걸 확인
        //1은 하나는 String 인스턴스, 하나는 Integer 인스턴스
        //for(int i=0; i<objArr.length; i++)
        for (Object value : objArr){
            set.add(value);
        }
        System.out.println("set = " + set);

        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}