package Multithreading.count_down_latch;

import java.util.concurrent.CountDownLatch;

public class Ex1 {

    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff is on place");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Everything is ready open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is open");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }

    public static void main(String[] args) throws InterruptedException {
         new Friend("Max", countDownLatch);
         new Friend("Igor", countDownLatch);
         new Friend("Ira", countDownLatch);
         new Friend("Gena", countDownLatch);
         new Friend("Pasha", countDownLatch);

         marketStaffIsOnPlace();
         everythingIsReady();
         openMarket();
    }
}

class Friend extends Thread {
    String name;
    private CountDownLatch countDownLatch;

    public Friend(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }

    public void run() {
        try {
            countDownLatch.await();
            System.out.println(name + " started shopping");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}


