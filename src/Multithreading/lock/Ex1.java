package Multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex1 {
}

class Call {
    public static void main(String[] args) {

        Call call = new Call();

        Thread thread1 = new Thread(() -> {
            call.mobileCall();
        });

        Thread thread2 = new Thread(() -> {
            call.skypeCall();
        });

        Thread thread3 = new Thread(() -> {
            call.whatsappCall();
        });
        thread1.start();
        thread2.start();
        thread3.start();
    }

    private Lock lock = new ReentrantLock();

    void mobileCall() {
        lock.lock();
        try {
            System.out.println("Mobile call start");
            Thread.sleep(3000);
            System.out.println("Mobile call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void whatsappCall() {
        lock.lock();
        try {
            System.out.println("Whatsapp call start");
            Thread.sleep(5000);
            System.out.println("Whatsapp call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }

    void skypeCall() {
        lock.lock();
        try {
            System.out.println("Skype call start");
            Thread.sleep(7000);
            System.out.println("Skype call end");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
    }
}
