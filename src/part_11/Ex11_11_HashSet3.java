package part_11;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Ex11_11_HashSet3 {
    public static void main(String[] args) {

        Person p1 = new Person("David", 10);
        Person p2 = new Person("David", 10);

        Set<Person> set = new HashSet<>();
        set.add(p1);
        set.add(p2);

        System.out.println("set = " + set);
    }
}

class Person{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return name +":" +age;
    }

    //만약 Object 클래스의 equals랑 hashCode 오버라이딩을 해주지 않으면
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person) {
           Person p = (Person)obj;
           return name.equals(p.name)&&p.age==age;
        }
        else
            return false;
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age);

    }

}
