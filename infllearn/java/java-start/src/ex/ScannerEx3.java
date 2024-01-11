package ex;

import java.util.Scanner;

public class ScannerEx3 {
    // 사용자로부터 음식의 이름, 가격, 수량을 입력받아 주문한 음식의 총 가격을 계산하고 출력하는 프로그램을 작성
    // 음식의 총 가격을 계산, 총 가격은 각 음식의 가겨고가 수량을 곱한 값이며 이것을 totalPrice 라는 변수에 저장
    // 주문한 음식의 정보와 총 가격을 출력. 출력 형태는 "[음식이름][수량]개를 주문하셨습니다. 총 가격은 [총 가격]원 입니다.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("음식 이름을 입력하세요. : ");
        String foodName = input.nextLine();
        System.out.print("음식의 가격을 입력해주세요. : ");
        int foodPrice = input.nextInt();
        System.out.print("주문 수량을 입력해주세요. : ");
        int foodQuantity = input.nextInt();

        int totalPrice = foodPrice * foodQuantity;

        System.out.println(foodName + " " + foodQuantity + "개를 주문하셨습니다. 총 가격은 " + totalPrice + "원 입니다. ");
    }
}
