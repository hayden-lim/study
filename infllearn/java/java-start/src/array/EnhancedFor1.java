package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        // 향상된 for 문 (for-each문)
        int[] numbers = {1, 2, 3, 4, 5};
        // 일반 for문
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            System.out.println(number);
        }

        // 단축기 iter 누르면 오른쪽처럼 자동으로 만들어줌 for (int number : numbers) {


        //향상된 for문 for~each문

        for (int number : numbers) {
            System.out.println(number);
        }

        //for-each 문을 사용할 수 없는 경우, 증가하는 index 값을 직접적으로 사용해야 하는 경우 사용 불가
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("number" + i + "번의 결과는: " + numbers[i]);
        }

    }
}
