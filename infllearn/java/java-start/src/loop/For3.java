package loop;

public class For3 {
    public static void main(String[] args) {
        // 1부터 시작해서 숫자를 계속 누적해서 더하다가 합계가 10보다 큰 처음 값은 얼마인가?
        // 1+2+3... 계속 더하다가 처음으로 합이 10보다 큰 경우를 찾으면 된다.
        // for(1.초기식(변수 선언); 2.조건식; 3. 증감식) {
        // //3.코드
        int sum = 0;
        int i = 1;

        for (; ; ) {
            sum += i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i= " + i + " sum= " + sum);
                break;
            }
            i++;
        }
    }

}