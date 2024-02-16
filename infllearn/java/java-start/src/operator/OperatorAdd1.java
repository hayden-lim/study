package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        //증감 연산자 = 증가 + 감소 연산자
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //1

        a = a + 1;
        System.out.println("a = " + a); //2

        //증감 연산자 (많이 써서 자바가 제공해줌)

        ++a; //a = a + 1
        System.out.println("a = " + a); //3
        ++a; //a = a + 1
        System.out.println("a = " + a); //4
        
        a = ++a;
        System.out.println("a = " + a);
        // 감소할땐 --a;
        
        --a;
        System.out.println("a = " + a);

        //증감 연산자는 피연산자(a) 앞, 뒤에 모두 둘 수 있음
        //위치에 따라 연산이 수행되는 시점이 달라짐
        // ++a 전위 증감 연산자 (Prefix) = 값을 먼저 증가시킴
        // a++ 후위 증감 연산자 (Postfix) = 변수를 쓰고 그 다음에 증가시킴
    }
}
