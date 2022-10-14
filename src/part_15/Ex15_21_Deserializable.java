package part_15;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class Ex15_21_Deserializable {
    public static void main(String[] args) {
        try{
            String fileName = "UserInfo.ser";
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);

            ObjectInputStream in = new ObjectInputStream(bis);

            //객체를 읽을 때는 출력한 순서와 일치해야 한다.
            Ex15_19_UserInfo u1 = (Ex15_19_UserInfo) in.readObject();
            Ex15_19_UserInfo u2 = (Ex15_19_UserInfo) in.readObject();
            ArrayList list = (ArrayList)in.readObject();

            System.out.println("u1 = " + u1);
            System.out.println("u2 = " + u2);
            System.out.println("list = " + list);
            in.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
