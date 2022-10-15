package part_11;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex11_12_HashSet4 {
    public static void main(String[] args) {

        Set set1 = new HashSet();
        Set set2 = new HashSet();
        Set setkho = new HashSet();
        Set sethap = new HashSet();
        Set setcha = new HashSet();

        set1.add("1"); set1.add("2");
        set1.add("3"); set1.add("4"); set1.add("5");
        System.out.println("set1 = " + set1);

        set2.add("6"); set2.add("7");
        set2.add("8"); set2.add("4"); set2.add("5");
        System.out.println("set2 = " + set2);



        Iterator it = set1.iterator();
        while (it.hasNext()){
            sethap.add(it.next());
        }

        it = set2.iterator();
        while (it.hasNext()){
            sethap.add(it.next());
        }


        it= set1.iterator();
        while(it.hasNext()){
            Object tmp = it.next();
            if(set2.contains(tmp))
                setkho.add(tmp);
        }

        it= set1.iterator();
        while(it.hasNext()){
            Object tmp = it.next();
            if(!set2.contains(tmp))
                setcha.add(tmp);
        }


        System.out.println("sethap = " + sethap);
        System.out.println("setcha = " + setcha);
        System.out.println("setkho = " + setkho);





    }
}
