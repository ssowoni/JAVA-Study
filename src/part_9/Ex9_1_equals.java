package part_9;

import com.sun.jdi.Value;

public class Ex9_1_equals {
    public static void main(String[] args) {
        //서로 다른 객체
        Value1 v1 = new Value1(10);
        Value1 v2 = new Value1(10);

        if(v1.equals(v2))
            System.out.println("v1과 v2는 같다.");
        else
            System.out.println("v1과 v2는 다르다.");

        String s = "ss";
        String s1 = "ss";

        System.out.println(s==s1);
        System.out.println(s.equals(s1));

        String s3 = new String("DD");
        String s4 = new String("DD");

        System.out.println(s3==s4);
        System.out.println(s3.equals(s4));

    }
}

class Value1{
    int value;


    public boolean equals(Object obj){
        if(obj instanceof Value1)
            return value ==((Value1)obj).value;
        else
            return false;
    }

    Value1(int value){
        this.value = value;
    }
}
