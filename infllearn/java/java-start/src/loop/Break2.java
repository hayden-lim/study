package loop;

public class Break2 {
    public static void main(String[] args) {
        // continue : 한 번 건너 뛰고 다음 반복문 진행

        int i = 1;
        while (i <= 5) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }
    }
}