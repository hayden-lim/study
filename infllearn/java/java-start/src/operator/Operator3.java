package operator;

public class Operator3 {
    public static void main(String[] args) {

        //덧셈보다 곱셈이 연산자 우선순위가 높다. 자바도 동일

        int sum1 = 1 + 2 * 3; //1 + (2 * 3)과 같다
        int sum2 = (1 + 2) * 3; //괄호 안이 우선순위가 먼저
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);

        //soutv > 변수 고를 수 있는 명령어


    }
}
