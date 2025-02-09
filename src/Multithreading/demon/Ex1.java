package Multithreading.demon;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("Application thread start");
        UserThread ut = new UserThread();
        ut.setName("UserThread");
        DemonThread dt = new DemonThread();
        dt.setName("DemonThread");
        dt.setDaemon(true);
        ut.start();
        dt.start();
        System.out.println("Application thread end");
    }
}

class UserThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is demon " + isDaemon());
        for (int i = 'a'; i < 'j'; i++) {
            try {
                sleep(300);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DemonThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() + " is demon " + isDaemon());
        for (char i = 1; i < 1000; i++) {
            try {
                sleep(100);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}