package ex;

public class MethodEx3 {
    //입출금 메서드 만들기
    public static void main(String[] args) {
        int balance = 10000;

        //입금 1000
        int depositAmount = 1000;
        balance += depositAmount;
        System.out.println(depositAmount + "원을 입금하였습니다. 현재 잔액: " + balance + "원");

        //출금 2000
        int withdrawAmount = 2000;
        if (balance >= withdrawAmount) {
            balance -= withdrawAmount;
            System.out.println(withdrawAmount + "원을 출금하였습니다. 현재 잔액: " + balance + "원");

        }else{
            System.out.println(withdrawAmount + "원을 출금할 수 없습니다. 잔액이 부족합니다. ");

        }
        System.out.println("최종 잔액: " + balance + "원");
    }

}
