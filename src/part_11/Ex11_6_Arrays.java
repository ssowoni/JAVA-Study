package part_11;

import java.util.Arrays;

import static java.util.Arrays.*;


public class Ex11_6_Arrays {
    //Arrays 클래스는 배열을 다루는 유용한 메서드가 정의되어 있다.
    //toString
    public static void main(String[] args) {


        // 배열 복사 - copyOf(), copyOfRange()
        int[] arr = {0, 1, 2, 3, 4};
        int[] arr2 = copyOf(arr, 3);
        int[] arr3 = copyOf(arr, 7);

        System.out.println("arr2 = " + Arrays.toString(arr2)); //arr2 = [0, 1, 2]
        System.out.println("arr3 = " + Arrays.toString(arr3)); //arr3 = [0, 1, 2, 3, 4, 0, 0]
        
        // 배열 채우기 - fill(), setAll()
        int[] arr4 = new int[5];
        fill(arr4,9);
        System.out.println("arr4 = " + Arrays.toString(arr4));
        setAll(arr4, (i) -> (int) (Math.random() * 5) + 1);
        System.out.println("arr4 = " + Arrays.toString(arr4));

        for(int i :arr4){
            char[] graph = new char[i];
            Arrays.fill(graph, '*');
            String fillGraph = new String(graph);
            System.out.println(fillGraph+i);
            //System.out.println(new String(graph)+i);
        }

        // 배열 정렬과 검색 - sort(), binarySearch()
        int[] arr5 = {1, 4, 0, 2, 3};
        sort(arr5);
        System.out.println("arr5 = " +Arrays.toString(arr5));
        System.out.println("binarySearch = " + binarySearch(arr5,2));

        //배열을 List로 변환 asList
    }


}
