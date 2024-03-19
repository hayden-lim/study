package cond;

public class If5 {
    public static void main(String[] args) {

        // 구매금액 할인 + 나이 할인 모두 다 중복되게 받을 수 있음
        // 이럴 경우 if문을 각각 따로 사용해야함

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매시, 1000원 할인");
        }

        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10세 이하 어린이는 1000원 할인");

        }
        System.out.println("총 할인 금액은 " + discount + "원 입니다.");
        }
    }


