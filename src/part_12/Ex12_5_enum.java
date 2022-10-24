package part_12;

import java.util.Arrays;

public class Ex12_5_enum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Kind.values()));
        for (Kind type : Kind.values()) {
            System.out.println(type);
        }

        Kind kind = Kind.CLOVER;
        System.out.println("kind.name() = " + kind.name());

        int ordinal = Kind.DIAMOND.ordinal();
        System.out.println("ordinal = " + ordinal);

        Kind diamond1 = Kind.valueOf("DIAMOND");
        System.out.println("diamond1 = " + diamond1);

        String type = Kind.DIAMOND.getKind();
        System.out.println("type = " + type);

        Kind diamond = Kind.DIAMOND;
        Kind clover = Kind.CLOVER;
        System.out.println(diamond.compareTo(clover));
        System.out.println(clover.compareTo(diamond));

        
    }

}

enum Kind {
    CLOVER("클로버"),
    HEART("하트"),
    DIAMOND("다이아몬드"),
    SPADE("스페이드");

    private final String kind;

    Kind(String kind) {
        this.kind = kind;
    }

    public String getKind() {
        return kind;
    }
}

enum Direction{
    EAST(1), SOUTH(5), WEST(-1), NORTH(10);


    private final int value; //정수를 저장할 필드(인스턴스 변수) 추가

    Direction(int value) {
        this.value = value;
    }

    public int getValue(){
        return value;
    }
}



