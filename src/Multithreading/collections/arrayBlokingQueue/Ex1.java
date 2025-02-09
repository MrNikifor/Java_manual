package Multithreading.collections.arrayBlokingQueue;

import java.util.concurrent.ArrayBlockingQueue;

public class Ex1 {
    public static void main(String[] args) {
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(4);

        //producer
        new Thread(() ->{
            int i=0;
            while(true){
                try {
                    arrayBlockingQueue.put(++i);
                    System.out.println("Producer put: " + i);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();

        //consumer
        new Thread(() ->{
            while(true){
                try {
                    Integer j = (Integer) arrayBlockingQueue.take();
                    System.out.println("Consumer take: " + j);
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }).start();
    }
}
