package loop;

public class DoWhile2 {
    public static void main(String[] args) {
        //DoWhile 문은 조건에 관계 없이 한번은 현재 값을 출력

        int i = 10;
        do {
            System.out.println("현재 숫자는 " + i);
            i++;
        } while (i < 3);

        // 최초 한 번은 항상 실행됨. 따라서 현재 숫자는 10이 출력됨
        // i=30 이기 때문에 while (i < 3) 은 false라 while 문을 빠져나옴
    }
}
