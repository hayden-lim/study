package casting;

public class Casting1 {
    // 작은 범위에서 큰 범위로는 당연히 값을 넣을 수 있다. ex int > long > double
    // 큰 범위에서 작은 범위는 문제가 발생  ex 소수점 버림, 오버플로우
    // 자바에서 숫자를 표현할 수 있는 범위는 int < long < double
    // 작은범위에서 큰 범위로의 대입은 허용한다

    public static void main(String[] args) {
        int intvalue = 10;
        long longvalue;
        double doublevalue;

        longvalue = intvalue; //int -> long
        System.out.println("longvalue = " + longvalue);

        doublevalue = intvalue; // int -> double
        System.out.println("doublevalue = " + doublevalue);

        doublevalue = 20l; //long -> double
        System.out.println("dooublevlaue 2 = " + doublevalue);
        // 이런 것들을 자동 형변환, 또는 묵시적 형변환이라고 한다

    }
}
