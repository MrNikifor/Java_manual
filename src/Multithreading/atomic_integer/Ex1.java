package Multithreading.atomic_integer;

import java.util.concurrent.atomic.AtomicInteger;

public class Ex1 {
    static AtomicInteger counter = new AtomicInteger(0);

    public static void increment() {
      //  counter.incrementAndGet();
        counter.addAndGet(4);
    }
    public static void main(String[] args) throws InterruptedException {
          Thread thread = new Thread(new MyRunnable());
          Thread thread1 = new Thread(new MyRunnable());

          thread.start();
          thread1.start();
          thread.join();
          thread1.join();

        System.out.println(counter);
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Ex1.increment();
        }
    }
}