package ex;

public class WhileEx1 {
    public static void main(String[] args) {
        // 처음 10개의 자연수를 출력하는 프로그램 작성
        // 변수는 count 사용, while문, for문 2가지 정답 사용
        int count = 1;
        while (count <= 10) {
            System.out.println(count++);
        }
    }
}

