package loop;

public class For1 {
    public static void main(String[] args) {
        //for문 : 반복횟수가 정해져 있을 때 주로 사용
        // for(1.초기식(변수 선언); 2.조건식; 3. 증감식) {
        // //3.코드
        // }

        // 1.초기식 실행 (주로 반복 횟수가 있을 때 사용, 초기식은 한 번 사용됨)
        // 2. 조건식 검증 (참이면 코드 실행, 거짓이면 for문을 빠져나감)
        // 3. 코드 실행
        // 4. 코드가 종료되면 증감식을 실행 (주로 초기식에 넣은 반복횟수와 관련된 변수의 값을 증가할 때 사용)
        // 5. 다시 2.조건식 부터 시작한다 (무한 반복)

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);

        }
        // ctrl + shift + enter 괄호까지 다 쳐서 문장을 완성해줌

    }
}
