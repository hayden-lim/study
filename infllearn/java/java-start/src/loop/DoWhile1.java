package loop;

public class DoWhile1 {
    public static void main(String[] args) {
        //DoWhile 문은 조건에 관계 없이 한번은 현재 값을 출력

        int i = 10;
        while (i < 3) {
            System.out.println("현재 숫자는" + i);
            i++;
        }
    }
}
