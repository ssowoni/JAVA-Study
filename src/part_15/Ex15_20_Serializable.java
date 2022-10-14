package part_15;

import java.io.*;
import java.util.ArrayList;

public class Ex15_20_Serializable {
    public static void main(String[] args) {
        try{
            String fileName = "UserInfo.ser";
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            ObjectOutputStream out = new ObjectOutputStream(bos);

            Ex15_19_UserInfo u1 = new Ex15_19_UserInfo("JavaMan", "1234", 30);
            Ex15_19_UserInfo u2 = new Ex15_19_UserInfo("JavaWoMan", "1234", 26);

            ArrayList<Ex15_19_UserInfo> list = new ArrayList<>();
            list.add(u1);
            list.add(u2);

            //직렬화한다.
            out.writeObject(u1);
            out.writeObject(u2);
            out.writeObject(list);

            out.close();
            System.out.println("직렬화가 끝났습니다.");
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
