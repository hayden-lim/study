package array;

public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[]{90, 80, 70, 60, 50, 40}; // 값이 들어간 배열 자동 생성. 배열 생성과 초기화
        // int[] students = new int[]{90 ,80, 70, 60, 50, 40}; 로 줄여도 된다
        //변수 값 사용
        for (int i = 0; i < students.length; i++) { //(int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + "점수 : " + students[i]);
        }
    }
}
