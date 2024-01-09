package scanner;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ScannerWhile2 {
    // 첫 번쨰 숫자와 두 번쨰 숫자를 더해서 출력하는 프로그램을 개발
    // 첫 번쨰 숫자와 두 번쨰 숫자 모두 0을 입룍하면 프로그램 종료
    // 프로그램은 반복해서 실행함
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("첫 번째와 두 번째에 모두 0을 입력하면 프로그램이 종료됩니다.");

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요");
            int num1 = scanner.nextInt();
            System.out.println("두 번째 숫자를 입력하세요");
            int num2 = scanner.nextInt();

        if (num1 == 0 && num2 == 0)     {
            System.out.println("프로그램이 종료됩니다.");
            break;

        }

        int sum = num1 + num2;
            System.out.println("두 숫자의 합 :" + sum);
    }
}
}

