package ref;

public class MethodChange1 {

    public static void main(String[] args) {
        int a = 10;
        System.out.println("호출전 : " +a);
        a = change(a);
        System.out.println("호출후 : " +a);
    }
    static int change(double b){
        int c = 20;
        return c;
    }
}
