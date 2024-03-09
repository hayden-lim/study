package cond;

public class If3 {
    public static void main(String[] args) {
        int age = 14;

        if (age <= 7) {
            System.out.println(" 미취학 ");
        }

        if (age >= 8 && age <= 13) {
            System.out.println(" 초등학생 ");
        }

        if (age >= 14 && age <= 16) {
            System.out.println(" 중학생 ");
        }

        if (age >= 17 && age <= 19) {
            System.out.println(" 고등학생 ");
        }

        if (age >= 20) {
            System.out.println(" 성인 ");
        }

        // 이런식으로 풀어서 사용하면 질문이 중복되는 느낌이 있음 (실무에서는 쓸모없이 실행이 반복됨)
        // else if문을 사용하면 조건을 만족했을 떄 그 이후는 코드 실행하지 않음



    }
}
