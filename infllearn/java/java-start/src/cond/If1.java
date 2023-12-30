package cond;

public class If1 {
    public static void main(String[] args) {
        int age = 20; //사용자의 나이

        if (age >= 18) {
            System.out.println("성인입니다");
        } // if 뒤가 참인 경우 true 인 경우에만 중괄호문이 실행이 됨 코드블럭을 중괄호로 지정해줘야 if 해당이 안 될 경우 다음 코드블럭으로 넘어감
        if (age < 18) {
            System.out.println("미성년자입니다");
        } // if 뒤가 flase 인 경우 코드블럭 자체가 실행 X
    }
}
