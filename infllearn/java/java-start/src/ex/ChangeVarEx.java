package ex;

public class ChangeVarEx {
    //변수 값 교환
    // 변수 a=10이 들어있고, b=20이 들어있다
    // 변수 a의 값과 b의 값을 서루 바꾸어라

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp;
        //시작 : 코드를 작성하세요
        temp = a; //10
        a = b;
        b = temp;

        //종료 : 코드를 작성하세요
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

}
