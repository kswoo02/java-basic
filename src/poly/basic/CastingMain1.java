package poly.basic;

public class CastingMain1 {
    public static void main(String[] args) {
        Parent poly = new Child();

        //다운 캐스팅 [부모 타입 -> 자식타입]
        Child child = (Child) poly;
        child.childMethod();

    }
}
