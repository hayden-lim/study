package operator;

public class Comp2 {
    public static void main(String[] args) {
        //문자열 비교 할 땐 ==이 아니라 .equals()메서드를 사용해야 함
        // == 사용시 비교가 가능할 때도 있는데 오류가 생길수도 있음

        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); //리터럴 비교
        boolean result2 = str1.equals("문자열1"); //문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); //문자열 변수 비교

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        // ctrl + shift + enter 문장 완성 시켜줌


    }
}
