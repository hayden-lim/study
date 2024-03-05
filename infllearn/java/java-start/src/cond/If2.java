package cond;

public class If2 {
    public static void main(String[] args) {
        // if 에 만족하는 조건이 없을 떄 else 실행
        // 우선 if문을 실행하고, if에 걸리지 않을 때 사용

        int age = 17;

        if (age >= 18) {
            System.out.println("당신은 성인입니다");

        } else {
            System.out.println("당신은     미성년자입니다");

        }

    }
}
