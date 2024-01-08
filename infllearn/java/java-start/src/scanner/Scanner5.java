package scanner;

import java.util.Scanner;

public class Scanner5 {
    // 반복문 예제, 사용자가 exit 를 입력할 때 까지 계속 작동
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("문자열을 입력하세요(exit : 종료) : ");
            String str = scanner.nextLine();
            if (str.equals("exit")){
                System.out.println("프로그램을 종료합니다. ");
                break;
            }
            System.out.println("입력한 문자열 : " + str);
            }
        }

    }

