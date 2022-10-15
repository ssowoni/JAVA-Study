package part_11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Ex11_18_HashMap3 {
    public static void main(String[] args) {
        String [] data = {"A","D","K","Z","D","A","K","K","A","K"};
        HashMap map = new HashMap();

        for (int i = 0; i < data.length; i++) {
            if (map.containsKey(data[i])) {
                int value = (int) map.get(data[i]);
                map.put(data[i], value + 1);
            } else {
                map.put(data[i], 1);
            }
        }

        System.out.println("map = " + map);

        //Map 인터페이스는 iterator()를 직접 호출할 수 없다.
        //따라서 entrySet이나 keySet같은 메서드로 따로 Set 형태로 얻어와야한다.
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry e = (Map.Entry) it.next();
            int value = (int) e.getValue();
            System.out.println(e.getKey() + ": " + printBar('#', value ) + " " + value);

        }


    }

    private static Object printBar(char c, int value) {
        char[] bar = new char[value];
        for(int i=0; i<bar.length; i++){
            bar[i] = c;
        }
        return new String(bar);
    }
}


