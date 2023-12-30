package loop;

public class While2_2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;


        sum = sum + i;
        System.out.println("i =" + i + " sum =" + sum);
        i++;

        sum = sum + i;
        System.out.println("i =" + i + " sum =" + sum);
        i++;

        sum = sum + i;
        System.out.println("i =" + i + " sum =" + sum);
        i++;

        // 처음 int i = 0; 의 값만 바꾸면 나머지를 바꾸지 않아도 됨

    }
}
