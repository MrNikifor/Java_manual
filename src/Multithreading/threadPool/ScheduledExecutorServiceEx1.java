package Multithreading.threadPool;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

public class ScheduledExecutorServiceEx1 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService =
                new ScheduledThreadPoolExecutor(1);
        for (int i = 0; i < 10; i++) {
            scheduledExecutorService.execute(new MyRunnable2());
        }
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getName() + " start work");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread " + Thread.currentThread().getName() + " end work");
    }
}