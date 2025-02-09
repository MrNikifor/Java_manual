package Multithreading.monitor;

public class Ex1Synchronized {
    public static void main(String[] args) {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter {
    static int count = 0;
}

class MyRunnable implements Runnable {

    private void doWork2(){
        System.out.println("Hello");
    }

    private void doWork() {
        doWork2();
        synchronized (this) {
            Counter.count++;
            System.out.print(Counter.count + " ");
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            doWork();
        }
    }
}
