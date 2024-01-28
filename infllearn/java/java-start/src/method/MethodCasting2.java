package method;

public class MethodCasting2 {
    public static void main(String[] args) {
       int number = 100;
       printNumber(number); // double이 더 큰 형태이므로 자동형변환됨
    }

    public static void printNumber(double n) {
        System.out.println("숫자: " + n);
    }
}
