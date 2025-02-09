package Multithreading.monitor;

import Multithreading.data_race.Ex1;

public class Ex2Synchronized {
    static int count = 0;
    // synchronized обеспечевиет синхронизацию работы потоков
    public static synchronized void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable2 runnable = new MyRunnable2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(count);
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            Ex1.increment();
        }
    }
}
