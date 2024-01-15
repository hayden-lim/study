package ex;

import java.util.Scanner;

public class ScannerWhileEx2 {
    //사용자로부터 상품의 가격(price)과 수량(quantity)를 입력받고, 총 비용을 출력하는 프로그램 작성
    // 가격과 수량을 입력받은 후에는 이들의 곱을 출력. 출력 형태는 "총 비용 : [곱한 결과]
    // -1을 입력하여 가격 입력을 종료
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("상품의 가격을 입력하세요. -1을 입력하면 종료됩니다.");
            int price = input.nextInt();

            if (price ==-1) {
                System.out.println("-1을 입력해서 프로그램이 종료됩니다.");
                break;
            }

            System.out.println("상품의 수량을 입력하세요. -1을 입력하면 종료됩니다.");
            int quantity = input.nextInt();

            if (quantity ==-1) {
                System.out.println("-1을 입력해서 프로그램이 종료됩니다.");
                break;

            }

            int totalCost = price * quantity;
            System.out.println("총 비용 :" + totalCost);
        }
    }
}
