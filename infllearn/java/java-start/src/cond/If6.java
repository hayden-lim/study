package cond;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매시 1000원 할인");

        } else if (age <= 10) { // else if로 먼저 가격조건이 성립되었기 때문에 할인 중복적용이 안됨
            discount = discount + 1000;
            System.out.println("10세 이하 어린이는 1000원 할인");

        // else if 의 경우 둘 중 하나만 적용된다. (if문으로 한 번 걸러진 끝난 상태에서 else if 이기 때문)

        } else {
            System.out.println("미해당시엔 별도 할인 없음");

        }
        System.out.println("총 할인 금액: " + discount + "원");

        if (true) System.out.println("if 문에서 실행된다");
            // 코드가 1줄일 떈 }{ 코드 블럭 생략 가능하나 권장하지 않음

        if (false)
            System.out.println("if 문에서 실행된다");
            System.out.println("if 문에서 실행되지 않는다");

    } // 고민할 필요 없이 중괄호(코드 블럭)을 사용하자!!
}

