package part_11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex11_16_HashMap {
    //HashMap은 키와 값을 각각 Object 타입으로 저장한다.
    //(Object, Object) 형태로 저장하기에 어떤 객체도 저장 가능하지만 키는 주로 String

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put("sss", 1234);
        map.put("aaa", 4567);
        map.put("www", 7890);

        while (true) {
            System.out.println("id와 password를 입력해주세요");

            Scanner sc = new Scanner(System.in);
            System.out.print("id : ");
            String id = sc.next();
            System.out.print("pass : ");
            int pass = sc.nextInt();

            if (!(map.containsKey(id))){
                System.out.println("해당 아이디가 존재하지 않습니다.");
            }else if(!(map.get(id).equals(pass)))
                System.out.println("id와 비밀번호가 일치하지 않습니다.");
            else {
                System.out.println("id와 비밀번호가 일치합니다.");
                break;
            }
        }

    }


}
