package cond;

public class Switch3 {
    public static void main(String[] args) {
        int grade = 2;
        int coupon;
            //break 가 있으면 멈추고 break가 없으면 중단하지 않고 다음 코드를 실행
        switch (grade) {
            case 1 :
                coupon = 1000;
                break;
            case 2 :
            case 3 :
                coupon = 3000;
                break;
            default :
                coupon = 500;

        }

        System.out.println("발급받은 쿠폰" + coupon);

        //장점은 보기 좀 더 직관적이다
    // switch 문은 조건식이 특정 케이스와 같은지만 사용 (값이 같은지만 단순히 확인)
    // if는 자유롭게 적을 수 있음, switch를 포함하는 느낌, 하지만 switch를 작성하면 조금 간결한 코드를 작성 가능

    // 자바 14 이후로 새로운 switch문이 나옴

    }
}
