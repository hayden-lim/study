package scope;

public class Scope3_2 {
    public static void main(String[] args) {
        // 변수를 선언한 시점부터 계속 사용할 수 있게 해도 되지 않을까? 왜 스코프가 생겼을까
        int m = 10;
        if (m > 0) {
            int temp = m + 2;
            System.out.println("temp =" + temp);
        }
        System.out.println("m = " +m);
    }
}
