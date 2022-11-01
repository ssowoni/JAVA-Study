package part_14;

import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex14_5_Stream {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        Stream<Integer> intStream = list.stream();

        intStream.forEach(System.out::println);

        IntStream intStream1 = IntStream.rangeClosed(1, 10);
        intStream1.skip(3).limit(5).forEach(System.out::print); //45678

        IntStream intStream2 = IntStream.of(1, 2, 2, 3, 3, 3, 4, 5, 5, 6);
        intStream2.distinct().forEach(System.out::print); //123456

        IntStream intStream3 = IntStream.rangeClosed(1, 10);//1~10
        intStream3.filter(i->i%2==0).forEach(System.out::print);//2,4,6,8,10

        System.out.println();
        
        File[] fileArr={new File("Ex1.java"), new File("Ex1"), new File("Ex1.bak")
                ,new File("Ex2.java"),new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fileArr);

        //map으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
        //모든 파일 이름 출력
        filenameStream.forEach(System.out::println); 

        //스트림 다시 생성
        fileStream = Stream.of(fileArr);


        //indexOf는 찾는 문자열 위치 반환
        //만약 입력값이 문자열에 없다면 리턴 값은 -1이다
        //substring(number) : number 숫자 위치부터 값 출력
        fileStream.map(File::getName)//map으로 Stream<File>을 Stream<String>으로 변환
                .filter(s->s.indexOf('.')!=-1) //확장자가 없는 것은 제외
                .peek(s->System.out.printf("filename=%s%n",s)) //파일명을 출력
                .map(s->s.substring(s.indexOf('.')+1)) //확장자만 추출
/*                .map(String::toUpperCase)//대문자로 변경
                .distinct()//중복제거*/
                .peek(s-> System.out.printf("extension=%s%n",s))
                .forEach(System.out::print); //JAVABAKTXT


    }
}
