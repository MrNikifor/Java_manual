package Multithreading.monitor;

public class SynchronisedCall {
    static final Object lock = new Object();

    void mobileCall() {
        synchronized (lock) {
            System.out.println("mobile call start");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("mobile call end");
        }
    }
    void skypeCall() {
        synchronized (lock) {
            System.out.println("skype call start");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("skype call end");
        }
    }
    void whatsappCall() {
        synchronized (lock) {
            System.out.println("whatsapp call start");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsapp call end");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableMobile());
        Thread thread2 = new Thread(new RunnableSkype());
        Thread thread3 = new Thread(new RunnableWhatsapp());
        thread1.start();
        thread2.start();
        thread3.start();
    }

}
class RunnableMobile implements Runnable{
    @Override
    public void run() {
        new SynchronisedCall().mobileCall();
    }
}
class RunnableSkype implements Runnable{
    @Override
    public void run() {
        new SynchronisedCall().skypeCall();
    }
}
class RunnableWhatsapp implements Runnable{
    @Override
    public void run() {
        new SynchronisedCall().whatsappCall();
    }
}