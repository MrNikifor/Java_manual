package Multithreading.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
            new Employee("Niki", lock);
            new Employee("Davo", lock);
            new Employee("Viki", lock);
            new Employee("Fako", lock);
    }
}

class Employee extends Thread {
    String name;
    public Lock lock;

    public Employee(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run() {
        if (lock.tryLock()) {
            try {
               /* System.out.println(name + " waiting for ATM");
                lock.lock();*/
                System.out.println(name + " used for ATM");
                Thread.sleep(2000);
                System.out.println(name + " finish used for ATM");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        }
        else System.out.println(name + "ATM is locked");
    }
}
