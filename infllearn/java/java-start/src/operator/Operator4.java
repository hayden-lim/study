package operator;

public class Operator4 {
    public static void main(String[] args) {
        int sum3 = 2 * 2 + 3 * 3;  //(2 * 2) + (3 * 3)
        int sum4 = (2 * 2) + (3 * 3); //sum3과 같다
        System.out.println("sum3 = " + sum3);
        System.out.println("sum4 = " + sum4);
        //복잡한 계산은 sum4처럼 괄호를 넣어 명시하는게 더 보기 쉽다
        //연산자 우선순위가 애매하거나 조금이라도 복잡해지면 언제나 괄호를 쓰자!

        //연산자 우선순위 암기법
        //1. 괄호()
        //2. 단항 연산자 (++,--,!,new,tyle)
        //3. 산술 연산자 (*,/,% 우선이고 그 다음에 +,-)
        //4. shift 연산자 (<<,>>,>>>)
        //5. 비교 연산자 (<,<=,>,>=>intanceof)

        //> 하지만 실무 개발자들은 외우지 않음, 검색해서 쓰면 됨

        // 상식선에서 우선순위를 사용 (+보다 *이 우선, 산술연산자가 대입연산자보다 먼저 등)
        // 애매하면 괄호를 꼭 사용!



    }
}
