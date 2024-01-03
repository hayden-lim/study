package casting;

public class Casting4 {
    public static void main(String[] args) {
        int divl = 3 / 2; //1.5 int / int
        System.out.println("divl = " + divl);

        double div2 = 3 / 2; //1.5 int / int
        System.out.println("div2 = " + div2);

        double div3 = 3.0 / 2; // 1.5 int > double 에 대입. 자동 형변환 발생해 double이 되어버림 3.0 / 2.0
        System.out.println("div3 =" + div3);

        double div4 = (double) 3 / 2; // 명시적 형변환 사용 (double) 괄호로 double / int 로 생각됨
        System.out.println("div4 = " + div4);

        int a = 3;
        int b = 2;
        double resurt = (double) a / b;
        System.out.println("result = " + resurt);

        // 같은 타입끼리의 계산은 같은 타입의 결과
        // 서로 다른 타입의 계산은 작은 > 큰 범위일 경우 자동 형변환이 일어남

    }
}
