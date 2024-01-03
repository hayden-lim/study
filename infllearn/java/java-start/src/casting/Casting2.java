package casting;

public class Casting2 {
    public static void main(String[] args) {
        // 반대로 큰 범위에서 작은 범위로 대입할 떈 명시적 형변환이 필요하다
        // double은 실수 표현 가능 (소숫점 1.5 가능) int 는 실수 표현 불가 ( 정수만 가능 )
        double doublevalue = 1.5;
        int intvalue = 0;

        // intvalue = doublevalue; //컴파일 오류 발생
        // 그래도 의도적으로 바꾸고 싶을 경우

        intvalue = (int) doublevalue; /// 명시적 형변환 (내가 바꿈)
        System.out.println(intvalue); // 소숫점은 사라지고 1만 남음


    }
}
