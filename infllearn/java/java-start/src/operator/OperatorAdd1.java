package operator;

public class OperatorAdd1 {
    public static void main(String[] args) {
        //증감 연산자
        int a = 0;

        a = a + 1;
        System.out.println("a = " + a); //1

        a = a + 1;
        System.out.println("a = " + a); //2

        //증감 연산자 (제공)

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
        // ++a 전위 증감 연산자 (Prefix)
        // a++ 후위 증감 연산자 (Postfix)
    }
}
