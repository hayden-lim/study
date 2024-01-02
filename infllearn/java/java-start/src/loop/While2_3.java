package loop;

public class While2_3 {
        public static void main(String[] args) {
            // i = 1이고 endNum = 3일 때
            int sum = 0;
            int i = 1;
            int endNum = 10;

            // 같은 코드를 endNum 보다 작을때까지 코드를 반복할 수 있게 하고 싶을 때 while 문을 사용한다

            while (i <= endNum) {
                sum = sum + i;
                System.out.println("i= " + i + " sum= " + sum);
                i++;
    }
}
    }