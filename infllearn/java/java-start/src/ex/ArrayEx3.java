package ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        // 사용자에게 5개의 정수를 입력 받아 배열에 저장하고, 입력 순서대로 출력
        // 출력시 포맷은 1,2,3,4,5 와 같이 쉼표를 사용해 구분하고, 마지막에는 쉼표를 넣지 않는다.

        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        System.out.println(" 5개의 정수를 입력하세요. : ");

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        System.out.println("역순으로 출력");
        for (int i = 4; i >= 0; i--) {
            System.out.print(numbers[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
    }
}