package ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        // 사용자들에게 5개의 정수를 입력받아 이들 정수의 합계와 평균을 계산하는 프로그램을 작성하자.
        // 입력받을 숫자의 개수를 입력받도록 개선

        Scanner scanner = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수를 입력하세요. : ");
        int count = scanner.nextInt();

        int[] numbers = new int[count];
        int sum = 0;
        double average;

        System.out.println( count + " 개의 정수를 입력하세요. : ");
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i] ;

        }

       average = ( double ) sum / count;

        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + average);


    }
}
