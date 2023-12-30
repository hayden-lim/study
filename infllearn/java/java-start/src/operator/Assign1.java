package operator;

public class Assign1 {
    public static void main(String[] args) {
        //대입 연산자 = (변수에 값을 할당)
        //축약(복합) 대입 연산자 +=,-=,*=,/+,%= 더하면서 넣고~ 곱하면서 넣고~ 나머지를 넣고~
        // 연산과 대입을 한 번에 축약해서 처리 ex) i = i + 3 -> i += 3

        int a =5;
        a += 3; // 8 (5 + 3) : a = a + 3
        a -= 2; // 6 (8 - 2) : a = a - 2
        a *= 4; // 24 (6 * 24) : a = a * 4
        a /= 3; // 8 (24 / 3) : a = a / 3
        a %= 5; // 3 (8 % 3) : a = a % 3
        System.out.println(a);

    }
}
