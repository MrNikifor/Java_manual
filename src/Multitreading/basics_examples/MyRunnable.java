package Multitreading.basics_examples;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello from " + Thread.currentThread());
    }
}
