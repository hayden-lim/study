package operator;

public class Comp1 {
    public static void main(String[] args) {
        //비교 연산자
        //== 동등성
        //!= 불일치
        //> 크다 < 작다
        // >= 크거나 같다 <= 작거나 같다

        // 참, 거짓형은 boolean 형 사용
        //= 대입 ==비교

        int a = 2;
        int b = 3;

        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);

        //결과를 boolean 변수에 담을 수 있음
        boolean result = a == b;
        System.out.println(result);


    }
}
