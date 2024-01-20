package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int[] students; // 배열 변수 선언
        students = new int[6];

        System.out.println(students);
        //I@a09ee92 -> I int 형 배열, @뒤가 메모리의 참조값을 16진수로 표현한것

        //변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;
        students[5] = 40;

        //변수 값 사용
        for (int i = 0; i < 5; i++) {
            System.out.println("학생" + (i + 1) + "점수 : " + students[i]);
        }
    }
}
