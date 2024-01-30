package ex;

public class MethodEx1 {
    //다음 코드를 메서드를 사용하도록 리펙토링해보자.

    public static void main(String[] args) {
        System.out.println("평균값: " + average(1,2,3));
        System.out.println("평균값: " + average(15,25,35));

        }

        public static double average(int a, int b, int c) {
        int sum = a + b + c;
        return sum / 3.0;

        }
}
