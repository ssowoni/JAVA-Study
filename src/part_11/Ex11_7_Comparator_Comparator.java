package part_11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex11_7_Comparator_Comparator {
    //Comparator와 Comparable은 모두 인터페이스로 컬렉션을 정렬하는데 필요한 메서드를 정의한다.
    //Comparable은 같은 타입 인스턴스끼리 비교 주로) Integer, String, Date, File 등등 ,, 오름차순 기준
    //정리해보자면
    //Comparable : 기본 정렬기준을 구하는데 사용 (java.lang)
    //Comparator : 기본 정렬기준 외에 다른 기준으로 정렬하고자할 때 사용 (java.util)
    public static void main(String[] args) {


        String[] strArr = {"cat", "Dog", "lion", "tiger"};

        Arrays.sort(strArr); //String의 Comparable 구현에 의한 정렬
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr)); //[Dog, cat, lion, tiger]

        Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER); //대소문자 구분 안 함
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr)); //[cat, Dog, lion, tiger]

        Arrays.sort(strArr, new Descending());
        System.out.println("Arrays.toString(strArr) = " + Arrays.toString(strArr)); //[tiger, lion, cat, Dog]
    }
}

class Descending implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
       if(o1 instanceof Comparable && o2 instanceof Comparable){
           Comparable c1 = (Comparable) o1;
           Comparable c2 = (Comparable) o2;
           return c1.compareTo(c2) * -1;

       }
       return -1;
    }
}

