package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    // 사용자의 입력을 받아 그 합계를 계산하는 프로그램 작성
    // 사용자는 한 번에 한 개의 정수를 입력할 수 있음
    // 사용자가 0을 입력하면 프로그램 종료
    // 프로그램 종료될 때 까지 사용자가 입력한 모든 정수의 합을 출력

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        while (true) {
            System.out.println("정수를 입력하세요. (0을 입력하면 종료됩니다.) : ");
            int number = input.nextInt();
            if (number == 0) {
                break;
            }
            sum += number;

        }
        System.out.println("입력한 모든 정수의 합: " + sum);

    }

}
