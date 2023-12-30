package loop;

public class Break1 {
    public static void main(String[] args) {

        // break : 반복문을 즉시 종료
        // continue : 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행

        int sum = 0;
        int i = 1;

        while(true) { // while(true)는 무한 반복
            sum = sum + i;
            if (sum > 10) {
                System.out.println("합이 10보다 크면 종료: i= " + i + " sum= " +sum );
                break; // break가 있어야 중간에 빠져나옴. 없으면 무한 반복됨



            }
        i++;
        }

    }
}
