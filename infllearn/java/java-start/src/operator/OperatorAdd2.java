package operator;

public class OperatorAdd2 {
    public static void main(String[] args) {
        //전위 증감 연산자 사용 예
        int a = 1;
        int b = 0;

        b = ++a; // a의 값을 먼저 증가시키고 그 결과를 b에 대입시킴
        System.out.println("a = " + a + ", b = " +b);
        // a = 2, b = 2
        //++a = a = a + 1
        //b = a 이후에 a 를 대입

        // ctrl + R = 마지막에 실행한것 다시 실행(이전 코드 실행) shift + ctrl + R = 현재 메인을 모두 실행

        //후위 증감 연산자 사용 예
        a = 1; //a 값을 다시 1로 지정
        b = 0; //b의 값도 다시 0으로 지정

        b = a++; // a의 현재 값을 b에 먼저 대입하고 그 이후 a 값을 증가시킴
        System.out.println("a = " + a + ", b = " +b); //결과 a = 2, b = 1

        //b = a; //a의 값을 먼저 b에 대입 b = 1
        // a = a + 1; // 그 이후에 a 값을 증가 a = 2

        //증감 연산자를 단독으로 사용할 경우 결과가 같음 (본인의 연산만 하기 때문)
        ++a;
        System.out.println("a = " + a);
        a++;
        System.out.println("a = " + a);


    }
}
