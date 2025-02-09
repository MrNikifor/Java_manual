package Multithreading.method_thread;

public class Ex3SleepJoin extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
    public static void main(String[] args) throws InterruptedException {
        Ex3SleepJoin ex3 = new Ex3SleepJoin();
        Thread runnable = new Thread(new MyRunnable());

        ex3.start();
        runnable.start();
        ex3.join();
        runnable.join();

        System.out.println("END");
    }
}

class MyRunnable implements Runnable {

    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
