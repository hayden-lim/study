package ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    // 사용자로부터 상품 정보(상품명, 가격, 수량)을 입력받고, 이들의 총 가격을 출력하는 프로그램 작성
    // 사용자는 여러 상품을 추가하고 결제 할 수 있음, 프로그램은 언제든 종료할 수 있음
    // 다음 세가지 옵션 제공. 1.상품 입력 2. 결제, 3.프로그램 종료
    // 상품 입력 옵션을 사용하며느 사용자에게 상품ㅁㅇ, 가격, 수량을 입력받음
    // 결제 옵션을 선택하면 총 비용을 출력하고 총 비용을 0으로 초기화 (사용자가 총 비용을 확인하고, 결제를 완료했다고 가정)
    // 다음 사용자를 위해 0으로 다시 초기화해야함.
    // 프로그램 종료 옵션을 선택하면 ' 프로그램을 종료합니다. ' 라는 메세지 출력하고, 프로그램을 종료
    // 위 세가지 옵션 외 다른 값을 입력하면, '올바른 옵션을 선택해주세요.' 라는 메세지 출력

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalCost = 0;

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            int option = input.nextInt();
            if (option ==1 ) {
                input.nextLine();
                System.out.print("상품명을 입력하세요 : ");

                String product = input.nextLine();

                System.out.print("상품의 가격을 입력하세요. : ");
                int price = input.nextInt();

                System.out.print("상품 구매 수량을 입력하세요. : ");
                int quantity = input.nextInt();


                totalCost += price * quantity;
                System.out.println("상품명 : " + product + " 가격 : " + price + " 수량 : " + quantity + "합계 : " + price * quantity);

            } else if (option == 2) {
                System.out.println("총 비용 : " + totalCost);
            } else if (option == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;

            }
        }
    }
}
