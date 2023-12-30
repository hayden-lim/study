package operator;

public class Logical1 {
    public static void main(String[] args) {
        //논리 연산자
        // &&그리고 : 두 연산자 모두 참이면 참 반환, 둘 중 하나라도 거짓이면 거짓ㅈ
        // ||또는 : or 연산, 둘 중 하나만 참이면 참, 둘 다 거짓이면 거짓
        // !부정 : 참이면 거짓으로, 거짓이면 참을 반환

        System.out.println("&&: AND 연산");
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println("||: OR 연산");
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println("!: 부정 연산");
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;

        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(!a);
        System.out.println(!b);

    }
}
