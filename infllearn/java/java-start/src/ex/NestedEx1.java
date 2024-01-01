package ex;

public class NestedEx1 {
    public static void main(String[] args) {
        // 중첩 for 문을 사용해 구구단을 출력
        // 1 * 1 = 1
        // 9 * 9 = 81

        for (int i = 1; i <= 9; i++){
            for (int j = 1; j <= 9; j++){
                System.out.println(i + " * " + j + " * " + i + j);
            }
        }
    }
}
