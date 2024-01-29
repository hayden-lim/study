package method;

public class OverLoading3 {
    public static void main(String[] args) {
        System.out.println("1: " + add(1,2));
        System.out.println("2: " + add(1.2,1.5));

    }
    public static int add(int a, int b) {
        System.out.println("1번 호출");
        return a + b;
        //위를 지워도 실행은 가능하다, 왜냐면 double은 int를 포함할 수 있어서
    }

    public static double add(double a, double b) {
        System.out.println("2번 호출");
        return a + b;
    }
}
// 본인 타입에 최대한 맞는 메서드를 찾아서 실행하고, 그래도 없으면 형 변환 가능한 타입의 메서드를 찾아 실행한다.