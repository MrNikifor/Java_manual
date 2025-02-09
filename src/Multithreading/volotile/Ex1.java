package Multithreading.volotile;

public class Ex1 extends Thread {
     boolean b = true;

    public void run() {
        int count = 1;
        while (b) {
            count++;
        }
        System.out.println("Ex1: " + count);
    }

    public static void main(String[] args) throws InterruptedException {
        Ex1 ex1 = new Ex1();
        ex1.start();
        Thread.sleep(3000);
        System.out.println("After 3 second, to wake up!");
        ex1.b = false;
        ex1.join();
        System.out.println("End of thread");
    }
}
