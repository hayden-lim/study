package casting;

public class Casting3 {
    public static void main(String[] args) {
        long maxIntValue = 2147483647; // int의 최고값
        long maxIntOver = 2147483648L; // int 최고값 + 1 (초과) L을 붙여 Long 표기
        int intvalue = 0;

        intvalue = (int) maxIntValue;
        System.out.println("maxIntValue casting = " + intvalue);

        intvalue = (int) maxIntOver; //형변환
        System.out.println("maxIntOver casting = " + intvalue); //int의 가장 작은것부터 다시 시작됨 = overFlow
         // overflow 가 발생한 상황 자체가 문제이므로 그 숫자를 가지고 어떻게 써먹을 생각을 말아야한다. 그냥 단순히 타입을 변경해라
    }
}
