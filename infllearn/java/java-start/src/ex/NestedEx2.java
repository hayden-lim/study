package ex;

public class NestedEx2 {
    // int rows 를 선언해 피라미드 출력
    // 참고로 println() 은 출력 후 다음 라인으로 넘어감
    // 라인을 넘기지 않고 출력하려면 print()를 사용
    public static void main(String[] args) {

        int rows = 10;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            }
        }
    }
