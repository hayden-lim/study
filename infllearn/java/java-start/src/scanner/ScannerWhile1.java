package scanner;

import java.util.Scanner;

public class ScannerWhile1 {
    public static void main(String[] args) {
        // 사용자가 입력한 문자열을 그대로 출력
        // exit 문자가 입력되면 프로그램을 종료
        // exit 입력 전까진 계속 프로그램 반복 실행

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("문자열을 입력하세요. (exit : 종료) ");
            String str = scanner.nextLine();
            if (str.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;


            }
            System.out.println("입력한 문자열: " + str);
        }
    }
}
