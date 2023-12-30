package ex;

public class Cond1 {
    public static void main(String[] args) {
        int score = 84;
        int grade;

       if (score >= 90) {
           System.out.println("학점은 A");
       } else if (score >= 80 && score < 90) {
           System.out.println("학점은 B");
       }else if (score >= 70 && score < 80) {
           System.out.println("학점은 C");
       } else if (score >= 60 && score < 70) {
           System.out.println("학점은 D");
       } else {
           System.out.println("학점은 F");
       }



    }
}
