package operator;

public class Operator2 {
    public static void main(String[] args) {
    // 자바는 문자열에도 + 연산자를 사용할 수 있음

        //문자열과 문자열 더하기1
        String result1 = "hello" + " world";
        System.out.println(result1);

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        //문자열과 숫자 더하기1
        String result3 = "a + b = " + 10;
        System.out.println(result3);
        // > 자바가 숫자를 문자열로 바꿔서 붙여버림

        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;
        System.out.println(result4);

        // 자바는 문자열인 String 타입에 다른 타입을 더할 경우 대상을 모두 문자열로 변경
        // 숫자도 문자로의 숫자로 변경한다는 의미



    }
}
