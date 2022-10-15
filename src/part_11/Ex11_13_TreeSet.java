package part_11;

import java.util.Set;
import java.util.TreeSet;

public class Ex11_13_TreeSet {
    public static void main(String[] args) {
        Set set = new TreeSet();
        for(int i=0;set.size()<6;i++){
            int random = (int) ((Math.random() * 45) + 1);
            set.add(random);
        }
        System.out.println("set = " + set);

        //이전 HashSet과는 다르게 정렬하는 코드가 빠진다.
    }
}
