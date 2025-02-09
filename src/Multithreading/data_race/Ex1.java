package Multithreading.data_race;

// Data Race - Это проблемма которая может возникнуть когда два или более потоков обращаются к одной перерменной
public class Ex1 {
    static int count = 0;
    // synchronized обеспечевиет синхронизацию работы потоков
    public static /*synchronized*/ void increment() {
        count++;
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println(count);
    }
}

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
             Ex1.increment();
        }
    }
}
