package part_11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class Ex11_8_HashSet2 {

    public static void main(String[] args) {


        HashSet set = new HashSet();
        //만약 i<6이라고 했다면 중복된 값이 나왔을 때 출력된 값이 6개가 아니라 4,5개가 될 수도 있다.
        //★ 그러므로 6개의 로또 번호를 출력하려고 할때 set.size의 크기가 6이 되게 설정해야함 !!
        for(int i=0; set.size()<6; i++) {
            int number = (int) ((Math.random() * 45) + 1);
            set.add(number);
        }
        System.out.println("set = " + set);

        //정렬하기 위한 Collections.sort는 인자로 list를 받는다.
        LinkedList list = new LinkedList(set);
        Collections.sort(list);
        System.out.println("list = " + list);

        

    }
}