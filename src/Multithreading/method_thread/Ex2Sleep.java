package Multithreading.method_thread;

public class Ex2Sleep {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("GO!");
    }
}
