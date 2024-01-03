package casting;

public class Casting2 {
    public static void main(String[] args) {
        // 반대로 큰 범위에서 작은 범위로 대입할 떈 명시적 형변환이 필요하다
        // double은 실수 표현 가능 (소숫점 1.5 가능) int 는 실수 표현 불가 ( 정수만 가능 )
        double doublevalue = 1.5;
        int intvalue = 0;

        // intvalue = doublevalue; //컴파일 오류 발생
        // 그래도 의도적으로 바꾸고 싶을 경우 (int) 와 같이 넣어 형변환을 하면 됨. 영어로는 Casting

        intvalue = (int) doublevalue; /// 명시적 형변환 (내가 바꿈)
        System.out.println(intvalue); // 소숫점은 사라지고 1만 남음
        System.out.println("doublevalue = " + doublevalue); // doublevalue 안의 값은 바뀌지 않았음.

        System.out.println((int) 10.5); // 캐스팅 한 것을 변수에 담은것. 형변환한거임 (int)로

        // 하지만 형변환을 한다고 해서 doublevalue 자체의 타입이 변경되거나 그 안의 값이 변경된 것은 아님.
        // 읽은 값을 형변환 하는것이지, 안에 들어있는 값은 그대로 유지됨

    }
}
