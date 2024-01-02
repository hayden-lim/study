package scope;

public class Scope1 {
    //지역 변수와 스코프
    //local variable 지역변수는 자신이 생성된 코드 블럭에서만 생존, 블록을 벗어나면 제거된다

    public static void main(String[] args) {
        int m = 10; // m 이라는 변수 생존 시작
        if (true) { //if 문은 생성된 if문 안에서만 생존
            int x = 20; // 변수 x 생존 시작
            System.out.println("if m = " + m);
            System.out.println("if x = " + x);
        } // 변수 x 생존 종료
         // System.out.println("main x = " + x);
        System.out.println("main x = " + m); // x는 생존 불가, m은 생존 가능
    } // 변수 m 생존 종료

    // int m 은 생존 법위만 맞으면 다 접근 가능
    // int x 는 if{} 블록 안에서만 생존 가능 > 이후 접근하면 cannot find symbol 이라는 컴파일 오류 발생
    // 지역 변수는 본인의 코드 블록 안에서만 생존 가능, 코드 블록을 벗어나면 제거됨 (접근 불가능)
    // 이렇게 적용할 수 있는 범위를 스코프라고 한다. m보단 x가 스코프가 짧다고 표현한다

}
