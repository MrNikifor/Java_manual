package Multithreading.method_thread;

// имя потока и приоритет
public class ex1 {
    public static void main(String[] args) {
        MyThread1 myThread1 = new MyThread1();
        System.out.println("name " + myThread1.getName() + "\n" + "priority " + myThread1.getPriority());

        myThread1.setName("myPotok");
        myThread1.setPriority(7);
        System.out.println("name " + myThread1.getName() + "\n" + "priority " + myThread1.getPriority());

    }
}
class MyThread1 extends Thread {
    public void run() {
        System.out.println("MyThread1 started");
    }
}