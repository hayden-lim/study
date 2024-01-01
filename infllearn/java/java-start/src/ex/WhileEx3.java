package ex;

public class WhileEx3 {
    public static void main(String[] args) {
        // 반복문 사용 1부터 max 까지의 합을 계산하고 출력하는 프로그램 작성
        // 변수는 sum을 사용해 누적합 표현, i라는 변수를 사용해 카운트 (1부터 max까지 증가하는 변수)

        int max = 100;
        int sum = 0;
        int i = 1;
        while (i <= max) {
            sum += i;
            i++;

        }
        System.out.println(sum);
    }
}
