package Multithreading.method_thread;

public class Ex4State extends Thread {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Application thread started");
        Thread worker = new Thread(new Worker());
        System.out.println(worker.getState());
        worker.start();
        System.out.println(worker.getState());
        worker.join();
        System.out.println(worker.getState());
        System.out.println("Application thread ended");
    }
}
class Worker implements Runnable {
    @Override
    public void run() {
        System.out.println("Worker started");
           try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        System.out.println("Worker finished");
    }
}
