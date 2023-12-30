package cond;

public class CondOp2 {
    public static void main(String[] args) {
        int age = 18;
        String status = (age >= 18) ? "성인" : "미성년자";
        System.out.println("age = " + age + " status = " + status );
        //자바에서 유일하게 항이 3개라 삼항연사자라고 부름.
    }

}
