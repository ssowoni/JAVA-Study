package part_14;

import java.util.Optional;

public class Ex14_6_Optional {

    String str = "abc";
    //특정 객체를 요소로 갖는 Stream을 생성하고 싶을 때 Stream.of()를 사용할 수 있다.
    Optional<String> optVal = Optional.of(str);
    Optional<String> optVal1 = Optional.of("abc");
    String str1 = optVal1.get();
    String str2 = optVal1.orElse("");
    Optional<String> optVal2 = Optional.of(new String("abc"));

    //만약 참조 변수 값이 null일 가능성이 있음 ofNullable(null) 사용
    Optional<String> optVal3 = Optional.ofNullable(null);

    //기본 값으로 초기화 empty()
    Optional<String> optVal4 = Optional.<String>empty();

}
