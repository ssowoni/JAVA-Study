package part_9;

import javax.naming.Name;
import java.util.*;

public class Ex9_2_equals2 {

    public static void main(String[] args) {

        //List<Person> persons = new ArrayList<>();
        Set<Person> persons = new HashSet<>();
        persons.add(new Person(8011L));
        persons.add(new Person(8011L));
        System.out.println(persons.size());

    }

}

class Person{
    long id;

    @Override
    public boolean equals(Object obj){
        if(obj instanceof Person)
            //obj가 Object 타입이므로 id값 참조 위해 Person 타입으로 형변환.
            //주소가 아닌 값을 비교해서 같으면 true
            return id==((Person)obj).id;
        else
            //타입이 Person이 아님 비교할 필요도 없다.
            return false;
    }

    @Override
    public int hashCode(){
        //Objects.hash() : 매개 값으로 주어진 값들을 이용해서 해시 코드를 생성하는 역할
        //동일한 필드값을 가지는 객체는 동일한 해시코드를 가질 수 있다.
        return Objects.hash(id);
    }

    public Person(long id) {
        this.id = id;
    }
}
