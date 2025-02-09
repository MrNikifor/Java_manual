package Multithreading.wait_notify;

public class Ex1 {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread t1 = new Thread(producer);
        Thread t2 = new Thread(consumer);
        t1.start();
        t2.start();

    }
}
class Market{
    private int breadCount = 0;

    public synchronized void getBread(){
        if(breadCount < 1){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Покупатель купил один хлеб");
        System.out.println("В магазине осталось " + breadCount + " хлеба");
        notify();
    }

    public synchronized void putBread(){
        if(breadCount >= 5){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Пекарь добавил " + breadCount + " хлеб");
        System.out.println("В магазине осталось " + breadCount + " хлеба");
        notify();
    }
}

class Producer implements Runnable{

    private Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            market.putBread();
        }
    }
}

class Consumer implements Runnable{

    private Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            market.getBread();
        }
    }
}