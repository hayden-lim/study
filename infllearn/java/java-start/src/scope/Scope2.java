package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { //블록 내부, for문 내
            System.out.println("for m = " + m); //블록 내부에서 외부는 접근 가능
            System.out.println("for i = " + i);
        } // i 생존 종료

        System.out.println("main m = " + m);
        // System.out.println("main i = " + i); // for 문 밖에서 접근하려고 하기 때문에 접근 불가
    }
}
