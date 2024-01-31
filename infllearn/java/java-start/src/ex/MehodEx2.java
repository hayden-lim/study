package ex;

public class MehodEx2 {
    public static void main(String[] args) {

        printMessage("Hello, world!",3);
        printMessage("java",5);
        printMessage("Hi",7);


    }

    public static void printMessage(String message, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(message);
        }
    }
}
