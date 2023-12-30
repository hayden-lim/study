package operator;

public class Operator1 {
    public static void main(String[] args) {
        //변수 초기화
        int a = 5;
        int b = 2;

        //덧셈

        int sum = a + b;
        System.out.println("a + b = " +sum); //출력 a + b = 7

        //뺄셈

        int diff = a - b;
        System.out.println("a - b = " +diff);
        //ctrl + R 실행

        //곱셈

        int multi = a * b;
        System.out.println("a * b = " + multi);

        //나눗셈

        int div = 5 / 2;  //int 형 끼리의 계산은 소숫점 표현 불가(int는 정수이기 때문)
        System.out.println("a / b = " +div);

        //나머지

        int mod = a % b;
        System.out.println("a % b = " + mod);

        // 0 으로는 수학적으로 나누기 불가 (수학적 허용 불가)


    }
}
