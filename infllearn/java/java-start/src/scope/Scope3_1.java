package scope;

public class Scope3_1 {
    public static void main(String[] args) {
        // 변수를 선언한 시점부터 계속 사용할 수 있게 해도 되지 않을까? 왜 스코프가 생겼을까
        int m = 10;
        int temp = 0;
        if (m > 0) {
            temp = m + 2;
            System.out.println("temp =" + temp);
        }
        System.out.println("m = " +m);
        // 조건이 맞으면 변수 m의 값을 2배 증가해 출력하는 코드
        // 2배 증가한 값을 저장하기 위해 임시 변수 temp를 사용
        // temp 는 if 코드 블록에서만 필요하지만, main() 코드 블록이 종료될 떄 까지 메모리에 유지되어 불필요한 메모리가 낭비됨
        // 코드 복잡성 증가
    }
}
